package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bagf {
    public static final cqce a = cqce.g("Bugle", "ConversationSettingsItemData");
    public String b;
    public String c;
    public Uri d;
    public boolean e;
    public boolean f;
    public boolean g;
    public bagd h;
    public boolean i;
    public ParticipantsTable.BindData j;
    public bvdk k;
    public Optional l;
    public Optional m;
    private ParticipantsTable.BindData n;
    private final crab o;
    private final cmum p;
    private final cpiz q;
    private final Context r;
    private final bvur s;

    public bagf(crab crabVar, cmum cmumVar, cpiz cpizVar, bvur bvurVar, Context context) {
        this.o = crabVar;
        this.p = cmumVar;
        this.q = cpizVar;
        this.r = context;
        this.s = bvurVar;
    }

    public final ParticipantsTable.BindData a() {
        ParticipantsTable.BindData bindData = this.j;
        return bindData != null ? bindData : this.n;
    }

    public final void b(bage bageVar, bagd bagdVar) {
        this.c = null;
        this.d = null;
        this.e = true;
        this.g = true;
        this.i = true;
        this.h = bagdVar;
        this.j = bageVar.a().a();
        this.n = bageVar.d();
        this.k = bageVar.e();
        boolean zJ = bageVar.j();
        bojh bojhVarB = bageVar.b();
        boolean zAq = bojhVarB.aq();
        boolean zAr = bojhVarB.ar();
        switch (bagdVar.ordinal()) {
            case 0:
                this.b = this.r.getString(R.string.notifications_enabled_conversation_pref_title);
                this.f = zAq;
                break;
            case 1:
                Context context = this.r;
                this.b = context.getString(R.string.notification_sound_pref_title);
                Uri uriA = this.o.a(bojhVarB.Z());
                this.c = context.getString(R.string.silent_ringtone);
                Optional optionalI = bageVar.i();
                if (optionalI.isPresent()) {
                    this.c = (String) optionalI.get();
                }
                this.e = false;
                this.d = uriA;
                this.g = zAq;
                break;
            case 2:
                this.b = this.r.getString(R.string.notification_vibrate_pref_title);
                this.f = zAr;
                this.g = zAq;
                break;
            case 3:
                this.b = this.r.getString(R.string.notifications_enabled_conversation_pref_title);
                this.e = false;
                break;
            case 4:
                this.b = this.r.getString(R.string.app_settings_conversation_pref_title);
                this.e = false;
                break;
            case 5:
                this.b = this.r.getString(R.string.xms_send_mode_pref_title_v2);
                this.f = bojhVarB.r() == 1;
                break;
            case 6:
                this.e = false;
                this.i = this.s.m() && zJ;
                this.b = this.r.getString(R.string.security_key_top_level_title);
                break;
            case 7:
                cqaz.l(this.j);
                this.b = this.r.getString(true != this.j.X() ? R.string.block_contact_title : R.string.unblock_contact_title);
                this.e = false;
                ParticipantsTable.BindData bindData = this.j;
                this.i = (bindData == null || this.p.d(bindData.T()) || !this.q.c()) ? false : true;
                break;
            case 8:
                this.b = this.r.getString(R.string.info_and_options_view_privacy_policy);
                this.e = false;
                break;
            case 9:
                this.b = this.r.getString(R.string.info_and_options_view_terms_of_service);
                this.e = false;
                break;
            case 10:
                this.b = cpef.a(this.r);
                this.e = false;
                break;
            case 11:
                ParticipantsTable.BindData bindDataA = a();
                bvdk bvdkVar = this.k;
                if (bindDataA != null) {
                    this.b = this.r.getString(bvdkVar == bvdk.SPAM_FOLDER ? R.string.unreport_contact_title : R.string.report_contact_title);
                    this.e = false;
                    this.i = !this.p.d(bindDataA.T());
                    break;
                } else {
                    this.i = false;
                    break;
                }
            case 12:
                this.b = this.r.getString(R.string.sim_switcher_overline);
                if (bageVar.f().isPresent()) {
                    this.c = ((aoer) bageVar.f().get()).q();
                }
                this.e = false;
                this.l = bageVar.g();
                this.m = bageVar.f();
                break;
        }
    }
}
