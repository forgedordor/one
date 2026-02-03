package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahds implements ahdq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl");
    public final efwo b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fdjx g;

    public ahds(Context context, efwo efwoVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        efwoVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar4.getClass();
        this.b = efwoVar;
        this.f = fcsuVar;
        this.c = fcsuVar3;
        this.g = fdjxVar;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
    }

    @Override // defpackage.ahdq
    public final void a(ea eaVar) {
        auvw.k(this.g, null, null, new ahdr(this, eaVar, null), 3);
    }

    @Override // defpackage.ahdq
    public final void b(ehac ehacVar) {
        ehacVar.getClass();
        ehacVar.a(((egbf) this.f.b()).a(this.b), new egzv<egbs>() { // from class: ahds.1
            @Override // defpackage.egzv
            public final void a(Throwable th) {
                th.getClass();
                ekrw ekrwVarJ = ahds.a.j();
                ekrwVarJ.X(eksq.a, "BugleProfiles");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl$registerMixinCallbacks$1", "onError", 77, "EditProfileEntryImpl.kt")).q("Failed to pull account info, unable to show profile menu item");
            }

            @Override // defpackage.egzv
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                egbs egbsVar = (egbs) obj;
                egbsVar.getClass();
                ahds ahdsVar = ahds.this;
                if (!((Boolean) ahdsVar.d.b()).booleanValue()) {
                    ((ahdv) ahdsVar.c.b()).b(false);
                    ekrw ekrwVarH = ahds.a.h();
                    ekrwVarH.X(eksq.a, "BugleProfiles");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl$registerMixinCallbacks$1", "onNewData", 61, "EditProfileEntryImpl.kt")).q("Edit profile is not enabled");
                    return;
                }
                boolean zEquals = egbsVar.k.equals("google");
                ((ahdv) ahdsVar.c.b()).b(zEquals);
                ekrw ekrwVarH2 = ahds.a.h();
                ekrwVarH2.X(eksq.a, "BugleProfiles");
                ekrd ekrdVar = (ekrd) ekrwVarH2;
                ekrdVar.X(new ekrz("should_show_profile_menu_item", Boolean.class, false, false), Boolean.valueOf(zEquals));
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/profile/editprofile/EditProfileEntryImpl$registerMixinCallbacks$1", "onNewData", 72, "EditProfileEntryImpl.kt")).q("Setting visibility of profile menu item");
            }

            @Override // defpackage.egzv
            public final /* synthetic */ void hn() {
            }
        });
    }
}
