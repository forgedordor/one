package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmj {
    public final evuh a;
    private final evrr b;

    public lmj(evuh evuhVar, evrr evrrVar) {
        evrrVar.getClass();
        this.a = evuhVar;
        this.b = evrrVar;
    }

    public final Object a(InputStream inputStream) throws ljr {
        try {
            Object objK = this.a.getParserForType().k(inputStream, this.b);
            objK.getClass();
            return objK;
        } catch (evtj e) {
            throw new ljr(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lmj(evuh evuhVar) {
        this(evuhVar, evrr.a);
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
    }
}
