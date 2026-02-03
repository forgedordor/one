package defpackage;

import android.R;
import android.content.Context;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwh implements ctjd {
    public static final cqce a = cqce.g("BugleContacts", "StartChatRcsUiAdapterImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/startchat/rcs/RcsGroupChatCapabilityCollector");
    public final Context c;
    public final cudy d;
    public final ctvb e;
    public final ahax f;
    public final cmum g;
    public final fcsu h;
    public final ains i;
    public final fduf j;
    public final fduf k;
    public final fduf l;
    public final fdpl m;
    private final fdjx n;
    private final fcyh o;
    private final ctro p;
    private final aqbm q;

    public ctwh(fdjx fdjxVar, Context context, fcyh fcyhVar, cudy cudyVar, ctvb ctvbVar, ahax ahaxVar, cmum cmumVar, fcsu fcsuVar, ains ainsVar, ctro ctroVar, aqbm aqbmVar, apwn apwnVar) {
        fdjxVar.getClass();
        context.getClass();
        fcyhVar.getClass();
        cudyVar.getClass();
        ctvbVar.getClass();
        ahaxVar.getClass();
        cmumVar.getClass();
        fcsuVar.getClass();
        ainsVar.getClass();
        ctroVar.getClass();
        apwnVar.getClass();
        this.n = fdjxVar;
        this.c = context;
        this.o = fcyhVar;
        this.d = cudyVar;
        this.e = ctvbVar;
        this.f = ahaxVar;
        this.g = cmumVar;
        this.h = fcsuVar;
        this.i = ainsVar;
        this.p = ctroVar;
        this.q = aqbmVar;
        this.j = fdvf.a(true);
        this.k = fdvf.a(true);
        this.l = fdvf.a(new ctvw(null, 7));
        this.m = new ctwa(((cuec) fcsuVar.b()).a(), this);
    }

    @Override // defpackage.ctjd
    public final void a() {
        if (((eoth) ((aplk) this.q).a.b()).a("bugle.skip_capabilities_check_for_group_rename") && this.p.b) {
            return;
        }
        fdjx fdjxVar = this.n;
        fcyh fcyhVar = this.o;
        auvw.k(fdjxVar, fcyhVar, null, new ctwd(this, null), 2);
        auvw.k(fdjxVar, fcyhVar, null, new ctwg(this, null), 2);
    }

    public final djmj b(String str, List list, fdae fdaeVar, fdae fdaeVar2) {
        Context context = this.c;
        String string = context.getString(R.string.ok);
        string.getClass();
        dktq dktqVar = new dktq(string, fdaeVar);
        String string2 = context.getString(R.string.cancel);
        string2.getClass();
        return new djmj(str, list, null, null, false, false, dktqVar, new dktq(string2, fdaeVar2), fdaeVar2, 60);
    }

    public final djmj c(final ChipData chipData, int i) {
        Object[] objArr = {"max_group_size_excluding_self", Integer.valueOf(i)};
        Context context = this.c;
        String strB = qxq.b(context, com.google.android.apps.messaging.R.string.group_limit_alert_dialog_message, objArr);
        String string = context.getString(R.string.ok);
        string.getClass();
        return new djmj(strB, null, null, null, false, false, new dktq(string, new fdae() { // from class: ctvr
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.d.c(chipData);
                return fctx.a;
            }
        }), null, new fdae() { // from class: ctvs
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.d.c(chipData);
                return fctx.a;
            }
        }, 190);
    }
}
