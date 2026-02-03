package defpackage;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwny extends cwod {
    public static final eksp a = eksp.c("BugleRbmDeepLinking");
    private static final List r = fcva.g("www.google", "search.google.com", "ads.google.com");
    private final fcsu A;
    public final Activity b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    private final cwnu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;

    public cwny(Activity activity, cwnu cwnuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23) {
        activity.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar17.getClass();
        fcsuVar18.getClass();
        fcsuVar19.getClass();
        fcsuVar20.getClass();
        fcsuVar21.getClass();
        fcsuVar23.getClass();
        this.b = activity;
        this.s = cwnuVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.k = fcsuVar9;
        this.l = fcsuVar10;
        this.t = fcsuVar11;
        this.m = fcsuVar12;
        this.u = fcsuVar13;
        this.v = fcsuVar14;
        this.w = fcsuVar15;
        this.x = fcsuVar16;
        this.n = fcsuVar17;
        this.o = fcsuVar18;
        this.p = fcsuVar19;
        this.y = fcsuVar20;
        this.z = fcsuVar21;
        this.A = fcsuVar22;
    }

    public static final Uri h(Uri uri) {
        if (uri != null && uri.isHierarchical()) {
            return uri;
        }
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        string.getClass();
        return Uri.parse(fdgn.r(string));
    }

    public static final boolean i(Intent intent) {
        Uri data = intent.getData();
        if (fdbq.f(data != null ? data.getScheme() : null, "sms")) {
            return true;
        }
        Uri data2 = intent.getData();
        return fdbq.f(data2 != null ? data2.getScheme() : null, "smsto");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cwnz
            if (r0 == 0) goto L13
            r0 = r6
            cwnz r0 = (defpackage.cwnz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwnz r0 = new cwnz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.A
            java.lang.Object r6 = r6.b()
            chtk r6 = (defpackage.chtk) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.barn.b(r5)
            eiju r5 = r6.e(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            java.lang.Object r5 = defpackage.fdct.b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwny.a(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Intent r22, java.lang.String r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwny.b(android.content.Intent, java.lang.String, fcxy):java.lang.Object");
    }

    public final String c(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        if (!((apsv) this.t.b()).a() || !i(intent)) {
            Uri uriH = h(data);
            if (uriH != null) {
                return uriH.getQueryParameter("bot-id");
            }
            return null;
        }
        Uri uriH2 = h(intent.getData());
        if (uriH2 == null) {
            return null;
        }
        ((eksl) a.h()).t("getBotIdFromSmsUri extracted uri: %s", uriH2);
        String queryParameter = uriH2.getQueryParameter("service_id");
        if (queryParameter != null) {
            return queryParameter;
        }
        String str = (String) fcva.P(d(intent));
        if (str == null) {
            return null;
        }
        cqce cqceVar = cmvy.a;
        if (alwh.i(str)) {
            return str;
        }
        return null;
    }

    public final List d(Intent intent) {
        Optional optionalB = ((cqti) this.v.b()).b(intent);
        final fdap fdapVar = new fdap() { // from class: cwnv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String[] strArr = (String[]) obj;
                eksp ekspVar = cwny.a;
                strArr.getClass();
                return fcur.M(strArr);
            }
        };
        Object objOrElseGet = optionalB.map(new Function() { // from class: cwnw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = cwny.a;
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: cwnx
            @Override // java.util.function.Supplier
            public final Object get() {
                eksp ekspVar = cwny.a;
                return fcvo.a;
            }
        });
        objOrElseGet.getClass();
        return (List) objOrElseGet;
    }

    public final void e(Uri uri, String str, String str2, String str3) throws IOException {
        ((eksl) a.h()).D("RBM deep link Url fallback: %s, referer: %s", uri, str3);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            eiid.o(this.s.fg(), intent);
            this.b.finish();
        } catch (ActivityNotFoundException e) {
            ((eksl) ((eksl) a.j()).g(e)).t("Activity was not found for intent, %s", intent);
            ((aspz) this.i.b()).m(8, str, str2, str3);
            g();
        }
    }

    public final void f() throws IOException {
        Activity activity = this.b;
        Uri data = activity.getIntent().getData();
        ((eksl) a.h()).t("Short Code not resolved, SMS fallback: %s", cqcv.b(data != null ? data.toString() : null));
        Intent intentPutExtra = new Intent("android.intent.action.VIEW").setClassName((Context) this.u.b(), "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(data).putExtra("rbm_sms_short_code_fallback", true);
        intentPutExtra.getClass();
        eiid.o(activity, intentPutExtra);
        activity.finish();
        aspz aspzVar = (aspz) this.i.b();
        enew enewVar = (enew) enfa.a.createBuilder();
        enewVar.getClass();
        enwn.d(9, enewVar);
        enwn.c(6, enewVar);
        aspzVar.e(enwn.a(enewVar), "", "sms", null);
    }

    public final void g() {
        ((eksl) a.h()).q("RBM Deep Link Error Page");
        cwoe cwoeVar = new cwoe();
        eyhj.e(cwoeVar);
        cg cgVar = new cg(this.s.fg().a());
        cgVar.D(R.id.content, cwoeVar);
        cgVar.c();
    }

    public final void j(int i, String str, String str2, boolean z, String str3) {
        aspz aspzVar = (aspz) this.i.b();
        enew enewVar = (enew) enfa.a.createBuilder();
        enewVar.getClass();
        enwn.d(9, enewVar);
        enwn.c(i, enewVar);
        enwn.b(z, enewVar);
        aspzVar.e(enwn.a(enewVar), str, str2, str3);
    }

    /* compiled from: PG */
    final class a implements egzv<asos> {
        public a() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) throws IOException {
            cwny cwnyVar = cwny.this;
            Activity activity = cwnyVar.b;
            Uri data = activity.getIntent().getData();
            ((eksl) ((eksl) cwny.a.j()).g(th)).t("Failed to retrieve bot metadata: %s", cqcv.b(data != null ? data.toString() : null));
            aspz aspzVar = (aspz) cwnyVar.i.b();
            Intent intent = activity.getIntent();
            intent.getClass();
            String strC = cwnyVar.c(intent);
            Uri data2 = activity.getIntent().getData();
            aspzVar.m(10, strC, data2 != null ? data2.getScheme() : null, activity.getIntent().getStringExtra("android.intent.extra.REFERRER"));
            cwoo cwooVar = (cwoo) cwnyVar.m.b();
            Intent intent2 = activity.getIntent();
            intent2.getClass();
            if (cwooVar.b(intent2).isPresent()) {
                cwnyVar.f();
            } else {
                cwnyVar.g();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x0303  */
        @Override // defpackage.egzv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void b(java.lang.Object r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 1014
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cwny.a.b(java.lang.Object):void");
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    }
}
