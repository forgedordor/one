package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oao {
    public final mdj b;
    public boolean d;
    public boolean e;
    public int g;
    public final List a = new ArrayList();
    public final obd h = new obd();
    public mdk c = mdk.a;
    public ByteBuffer f = mdm.a;

    public oao(ekgb ekgbVar) {
        this.b = new mdj(ekgbVar);
    }

    public static boolean d(mdk mdkVar) {
        return (mdkVar.d == -1 || mdkVar.b == -1 || mdkVar.c == -1) ? false : true;
    }

    public final mdk a() {
        return this.b.a;
    }

    public final oaq b(obt obtVar, mau mauVar) throws ocp {
        mee.a(mauVar.I != -1);
        try {
            oaq oaqVar = new oaq(this.c, obtVar, mauVar);
            if (Objects.equals(this.c, mdk.a)) {
                mdk mdkVar = oaqVar.a;
                this.c = mdkVar;
                mdj mdjVar = this.b;
                mdjVar.a(mdkVar);
                mdjVar.c();
            }
            this.a.add(new oan(oaqVar));
            int i = mjr.a;
            return oaqVar;
        } catch (mdl e) {
            throw ocp.a(e, "Error while registering input " + this.a.size());
        }
    }

    public final void c() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                list.clear();
                obd obdVar = this.h;
                obdVar.a.clear();
                obdVar.b = 0;
                mdk mdkVar = mdk.a;
                obdVar.c = mdkVar;
                obdVar.d = -1;
                obdVar.e = new obb[0];
                obdVar.f = -9223372036854775807L;
                obdVar.g = -1L;
                obdVar.h = 0L;
                obdVar.i = Long.MAX_VALUE;
                obdVar.j = 0L;
                this.b.f();
                this.g = 0;
                this.f = mdm.a;
                this.c = mdkVar;
                return;
            }
            ((oan) list.get(i)).a.d.f();
            i++;
        }
    }

    public final boolean e() {
        return !this.f.hasRemaining() && this.g >= this.a.size() && this.h.e();
    }
}
