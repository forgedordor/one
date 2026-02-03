package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgcq {
    public static Object a(fgcp fgcpVar, Class cls) throws Exception {
        try {
            return fgcpVar.a();
        } catch (Exception e) {
            if (fgh$$ExternalSyntheticApiModelOutline0.m$1(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (fgh$$ExternalSyntheticApiModelOutline0.m$2(e)) {
                throw b(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static CronetException b(Exception exc) {
        if (fgh$$ExternalSyntheticApiModelOutline0.m$2(exc)) {
            return fgh$$ExternalSyntheticApiModelOutline0.m479m((Object) exc) ? new fgbm(fgh$$ExternalSyntheticApiModelOutline0.m461m((Object) exc)) : fgh$$ExternalSyntheticApiModelOutline0.m$3(exc) ? new fgbl(fgh$$ExternalSyntheticApiModelOutline0.m460m((Object) exc), false) : fgh$$ExternalSyntheticApiModelOutline0.m$4(exc) ? new fgbd(fgh$$ExternalSyntheticApiModelOutline0.m((Object) exc)) : new fgbk(fgh$$ExternalSyntheticApiModelOutline0.m459m((Object) exc));
        }
        throw new IllegalArgumentException("Not an Android Cronet exception", exc);
    }
}
