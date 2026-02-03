package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqdd extends eqeb {
    private String a;
    private eqef b;
    private Map c;
    private eqdp d;
    private byte e;

    @Override // defpackage.eqeb
    public final eqed a() {
        int i = ~this.e;
        if ((i & 1) != 0) {
            throw new IllegalStateException("Missing required properties: name");
        }
        String str = this.a;
        eqef eqefVar = this.b;
        Map map = this.c;
        eqdp eqdpVar = this.d;
        Map map2 = map;
        if ((i & 2) != 0) {
            eqefVar = eqef.b;
        }
        if ((i & 4) != 0) {
            map2 = fcvp.a;
        }
        if ((i & 8) != 0) {
            eqdpVar = eqdp.a;
        }
        return new eqed(str, eqefVar, map2, eqdpVar, eqdu.a);
    }

    @Override // defpackage.eqeb
    public final void b(eqdp eqdpVar) {
        this.d = eqdpVar;
        this.e = (byte) (this.e | 8);
    }

    @Override // defpackage.eqeb
    public final void c(Map map) {
        this.c = map;
        this.e = (byte) (this.e | 4);
    }

    @Override // defpackage.eqeb
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.eqeb
    public final void e(eqef eqefVar) {
        if (eqefVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = eqefVar;
        this.e = (byte) (this.e | 2);
    }
}
