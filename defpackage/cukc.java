package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.function.BooleanSupplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cukc extends cukp {
    private static final cqce sp = cqce.g("Bugle", "BaseBugleActivity");
    private long o;
    private boolean p;
    public cogw s;
    public cukm t;
    public fcsu u;
    public baci v;
    public cpch w;
    public fcsu x;

    protected boolean I() {
        return false;
    }

    protected void L() {
        dztc.a.d(dzfh.b(getClass()));
    }

    protected abstract cuhe fa();

    protected BooleanSupplier fc() {
        return new BooleanSupplier() { // from class: cukb
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                cukc cukcVar = this.a;
                return cukcVar.t.c(cukcVar);
            }
        };
    }

    @Override // defpackage.cukp, defpackage.ecdl, defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((cuhd) this.x.b()).a(this, fa());
        L();
        if (fc().getAsBoolean()) {
            sp.p("Redirecting to default SMS/permission check activity");
        }
        if (bundle != null && bundle.getBoolean("PrevDarkModeStateKey", this.w.g()) != this.w.g()) {
            this.v.a();
        }
        this.p = this.w.g();
    }

    @Override // defpackage.ecdl, defpackage.eg, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.t.a(this.s.f().toEpochMilli() - this.o);
    }

    @Override // defpackage.ecdl, defpackage.eg, defpackage.abi, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((crmg) this.u.b()).k(i);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        cukm cukmVar = this.t;
        if (I()) {
            ((bwwe) cukmVar.e.b()).b();
        }
    }

    @Override // defpackage.ecdl, defpackage.eg, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (fc().getAsBoolean()) {
            sp.p("Redirecting to default SMS/permission check activity");
        }
        final cukm cukmVar = this.t;
        ecem.c();
        auwa.a(new Runnable() { // from class: cuki
            @Override // java.lang.Runnable
            public final void run() {
                cukm cukmVar2 = cukmVar;
                cqnx.c(((aiul) cukmVar2.d.b()).g(cukmVar2.b.f().toEpochMilli()), "BugleUsageStatistics", "Failed to update LastPassiveEventTimeMillis");
            }
        }, cukmVar.c);
        if (!craf.j(this)) {
            eeji eejiVar = new eeji(this);
            eejiVar.k(R.string.sms_disallowed_message);
            eejiVar.i(false);
            eejiVar.m(R.string.sms_disallowed_close_button, new DialogInterface.OnClickListener() { // from class: cukk
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    System.exit(0);
                }
            });
            eejiVar.a();
        } else if (!I()) {
            ((bwwe) cukmVar.e.b()).b();
        }
        this.o = this.s.f().toEpochMilli();
    }

    @Override // defpackage.ecdl, defpackage.abi, defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("PrevDarkModeStateKey", this.p);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // defpackage.ecdl, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
