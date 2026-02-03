package defpackage;

import android.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjg {
    public final cyiz a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public AlertDialog g;
    public int h;
    public final ehay i = new cyjf(this);
    public final egps j = new egps<Void, Void>() { // from class: cyjg.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            AlertDialog alertDialog = cyjg.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration pending");
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            cqca.c("Bugle", "Registered successfully with tachyon");
            AlertDialog alertDialog = cyjg.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration successful");
            }
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            cqca.p("Bugle", th, "Registration with Tachyon failed");
            AlertDialog alertDialog = cyjg.this.g;
            if (alertDialog != null) {
                alertDialog.setTitle("Registration failed");
            }
        }
    };

    public cyjg(cyiz cyizVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = cyizVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
    }
}
