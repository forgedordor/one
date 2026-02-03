package defpackage;

import android.content.Context;
import android.os.UserManager;
import android.provider.Settings;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidl implements aidh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl");
    public static final Optional b = Optional.empty();
    public final Context c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public boolean h;
    private final fdjx i;
    private final ejxr j;

    public aidl(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar, fcsu fcsuVar5, arjk arjkVar) {
        context.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        fcsuVar5.getClass();
        arjkVar.getClass();
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.i = fdjxVar;
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: aidi
            @Override // defpackage.ejxr
            public final Object get() {
                boolean zIsDemoUser;
                aidl aidlVar = this.a;
                if (crad.d()) {
                    zIsDemoUser = false;
                    if (Settings.Secure.getInt(aidlVar.c.getContentResolver(), "shopdemo", 0) == 1) {
                        zIsDemoUser = true;
                    }
                } else {
                    zIsDemoUser = ((UserManager) aidlVar.d.b()).isDemoUser();
                }
                aidlVar.h = true;
                return Boolean.valueOf(zIsDemoUser);
            }
        });
        ejxrVarA.getClass();
        this.j = ejxrVarA;
    }

    @Override // defpackage.aidh
    public final void a() {
        auvw.k(this.i, null, null, new aidk(this, null), 3);
    }

    @Override // defpackage.aidh
    public final boolean b() {
        return d();
    }

    @Override // defpackage.aidh
    public final boolean c() {
        return this.h && d();
    }

    public final boolean d() {
        try {
            Object obj = this.j.get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        } catch (Exception e) {
            ((ekrd) ((ekrd) a.j()).g(e).h("com/google/android/apps/messaging/retailmode/RetailModeEntryPointImpl", "isDemoUser", 131, "RetailModeEntryPointImpl.kt")).q("Failed to check if device is running in Retail Demo mode");
            return false;
        }
    }
}
