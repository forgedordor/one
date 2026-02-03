package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgvj {
    public final fcsu a;
    public final dhjt b;
    public final ebky d;
    public int e;
    public int f;
    public String g;
    public dhau j;
    public int i = 3;
    public final eblu h = new dgvi(this);
    public final String c = "presence";

    public dgvj(dgvq dgvqVar, fcsu fcsuVar, String str, dhjt dhjtVar) throws ebmn {
        this.a = fcsuVar;
        this.b = dhjtVar;
        dfys dfysVar = dgvqVar.a;
        eblf eblfVar = ((eblg) fcsuVar).a;
        if (eblfVar.v()) {
            throw new ebmn("No sip stack. Can't generate dialog path");
        }
        if (Objects.isNull(str)) {
            throw new ebmn("Uri is null. Can't generate dialog path");
        }
        String strW = eblf.w();
        ArrayList arrayListQ = eblfVar.q();
        String strE = dfysVar.e();
        if (Objects.isNull(strE)) {
            throw new ebmn("No public identity in ImsConfiguration.");
        }
        this.d = new ebky(strW, 0, str, strE, str, arrayListQ);
    }

    public final void a() {
        this.g = null;
        this.e = 0;
        this.i = 3;
    }
}
