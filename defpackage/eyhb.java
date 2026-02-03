package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eyhb implements eyhc, eyhx {
    protected final Activity a;
    public final eyhx b;
    private volatile Object c;
    private final Object d = new Object();

    /* compiled from: PG */
    public interface a {
        ahhi O();
    }

    public eyhb(Activity activity) {
        this.a = activity;
        this.b = activity instanceof abi ? new eyhe((abi) activity) : new eyhg(activity);
    }

    protected Object a() {
        Activity activity = this.a;
        if (!(activity.getApplication() instanceof eyhx)) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(Application.class.equals(activity.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(activity.getApplication().getClass())))));
        }
        ahhi ahhiVarO = ((a) eygm.a(this.b, a.class)).O();
        ahhiVarO.c = activity;
        return new ahhk(ahhiVarO.a, ahhiVarO.b, ahhiVarO.c);
    }

    @Override // defpackage.eyhc
    public final eygp b() {
        return (eygp) this.b.bb();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = a();
                }
            }
        }
        return this.c;
    }

    public final eyhn c() {
        eyhe eyheVar = (eyhe) this.b;
        return ((eyhf) eyhe.a(eyheVar.a, eyheVar.b).a(eyhf.class)).b;
    }
}
