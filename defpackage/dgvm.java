package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgvm {
    public final dhjt b;
    public final ebky c;
    public final fcsu d;
    public String[] e;
    public String[] f;
    public String g;
    public String h;
    public String i;
    private final dgvq k;
    private final dhfw l;
    private boolean m;
    private boolean n;
    private final boolean o;
    private final boolean p;
    private final ekgb q;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final String j = "false";

    public dgvm(dgvq dgvqVar, fcsu fcsuVar, String str, ekgb ekgbVar, ebky ebkyVar, dhjt dhjtVar, boolean z, boolean z2) throws ebmn {
        this.k = dgvqVar;
        this.d = fcsuVar;
        this.l = new dhfw(dgvqVar.a.c());
        this.q = ekgbVar;
        this.b = dhjtVar;
        if (ebkyVar != null) {
            this.c = ebkyVar;
        } else {
            dfys dfysVar = dgvqVar.a;
            if (Objects.isNull(dfysVar.c())) {
                throw new ebmn("Null ImsConfiguration,");
            }
            String strE = dfysVar.e();
            if (Objects.isNull(strE)) {
                throw new ebmn("Null Public Identity in ImsModule.");
            }
            if (Objects.isNull(str)) {
                throw new ebmn("Null remote Uri. Can't create dialog path.");
            }
            eblf eblfVar = ((eblg) fcsuVar).a;
            if (eblfVar.v()) {
                throw new ebmn("Null SipStack. Can't create dialog path.");
            }
            this.c = new ebky(eblf.w(), 1, str, strE, str, eblfVar.q());
        }
        this.o = z;
        this.p = z2;
    }

    private final void h(ebqs ebqsVar) {
        d(ebqsVar.y(), ebqsVar.A());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.ebqr a() throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, defpackage.ebmn, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgvm.a():ebqr");
    }

    public final void b(dgvo dgvoVar) {
        this.a.add(dgvoVar);
    }

    protected final void c(dgvn dgvnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dgvo) it.next()).c(this, dgvnVar);
        }
    }

    protected final void d(int i, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dgvo) it.next()).d(this, i, str);
        }
    }

    public final void e(dgvo dgvoVar) {
        this.a.remove(dgvoVar);
    }

    public final void f(ebqr ebqrVar) {
        try {
            eblm eblmVarL = ((eblg) this.d).a.l(ebqrVar);
            eblmVarL.h(15);
            if (!eblmVarL.g()) {
                d(408, "timeout");
                return;
            }
            int iA = eblmVarL.a();
            ebqs ebqsVarB = eblmVarL.b();
            if (ebqsVarB == null) {
                dhja.g("SIP response is null.", new Object[0]);
                throw new ebmn("SIP response is null.");
            }
            if (iA != 200 && iA != 202) {
                if (iA == 403) {
                    if (this.m) {
                        h(ebqsVarB);
                        return;
                    } else {
                        this.m = true;
                        return;
                    }
                }
                if (iA != 407) {
                    h(ebqsVarB);
                    return;
                }
                if (this.n) {
                    h(ebqsVarB);
                    return;
                }
                this.n = true;
                try {
                    dhja.k("407 response received", new Object[0]);
                    String strL = ebqsVarB.l();
                    if (strL == null) {
                        strL = "";
                    }
                    ebky ebkyVar = this.c;
                    ebkyVar.e = dhjv.i(strL);
                    dhfw dhfwVar = this.l;
                    dhfwVar.a(ebqsVarB);
                    ebkyVar.a();
                    dhja.k("Send second REFER", new Object[0]);
                    ebqr ebqrVarA = a();
                    dhfwVar.b(ebqrVarA);
                    ebos ebosVar = ebqrVarA.y().f;
                    if (ebosVar == null) {
                        throw new IllegalStateException("To header is null.");
                    }
                    ebosVar.e();
                    f(ebqrVarA);
                    return;
                } catch (Exception e) {
                    dhja.i(e, "Reference failed", new Object[0]);
                    c(new dgvn(e));
                    return;
                }
            }
            dgvq dgvqVar = this.k;
            dhja.c("Add reference %s", this);
            dgvqVar.b.add(this);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((dgvo) it.next()).a(this);
            }
        } catch (Exception e2) {
            dhja.i(e2, "Error while referring: %s", e2.getMessage());
            c(new dgvn("Error while rejecting refer: ".concat(String.valueOf(e2.getMessage())), e2));
        }
    }

    public final void g() {
        ((dgvl) dfds.a(dgvl.class)).s().submit(new dgvk(this));
    }
}
