package com.masterfulmc.mods.graaljs;

import com.oracle.truffle.js.scriptengine.GraalJSScriptEngine;
import net.neoforged.fml.common.Mod;
import org.graalvm.polyglot.Context;

import javax.script.ScriptException;

@Mod(Ref.ID)
public class ModRoot {

    public ModRoot() {
        var js = GraalJSScriptEngine.create(null, Context.newBuilder("js").allowAllAccess(true));
        try {
            js.eval("console.log('::TESTING GRAALJS WITH PRINT FROM JAVASCRIPT::')");
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
