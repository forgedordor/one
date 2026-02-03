package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class agiz extends fdbb implements fdat {
    public agiz(Object obj) {
        super(2, obj, agjd.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/shared/api/messaging/ConversationProperties;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Resources.NotFoundException {
        String string;
        final agjd agjdVar = (agjd) this.b;
        cgrb cgrbVarK = ((ajlk) obj).k();
        Instant instantF = agjdVar.g.f();
        instantF.getClass();
        cgrc cgrcVarA = cgrbVarK.a(instantF);
        if (cgrcVarA == cgrc.b || cgrcVarA == cgrc.c) {
            return null;
        }
        Instant instant = cgrbVarK.a != cgra.e ? cgrbVarK.b : null;
        if (instant == null || (string = agjdVar.a.getString(R.string.temporary_snooze_banner_title, dngk.a(instant))) == null) {
            string = agjdVar.a.getString(R.string.permanent_snooze_banner_title);
            string.getClass();
        }
        String str = string;
        Context context = agjdVar.a;
        String string2 = context.getString(R.string.snooze_banner_content);
        tdq tdqVar = new tdq(djrr.dP);
        String string3 = context.getResources().getString(R.string.unsnooze_banner_button_title);
        string3.getClass();
        return new tdo("snooze_banner", str, string2, tdqVar, new tdk(string3, new fdae() { // from class: agiw
            @Override // defpackage.fdae
            public final Object invoke() {
                agjd agjdVar2 = agjdVar;
                auvw.k(agjdVar2.c, null, null, new agjc(agjdVar2, null), 3);
                return fctx.a;
            }
        }), null, true, new fdae() { // from class: agix
            @Override // defpackage.fdae
            public final Object invoke() {
                agjd agjdVar2 = agjdVar;
                auvw.k(agjdVar2.c, agjdVar2.b, null, new agjb(agjdVar2, null), 2);
                return fctx.a;
            }
        }, new fdae() { // from class: agiy
            @Override // defpackage.fdae
            public final Object invoke() {
                agjd agjdVar2 = agjdVar;
                auvw.k(agjdVar2.c, agjdVar2.b, null, new agja(agjdVar2, null), 2);
                return fctx.a;
            }
        }, 320);
    }
}
