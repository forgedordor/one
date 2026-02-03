package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgh {
    private static final ekrg o = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/TextBubbleUiAdapter");
    private final ardm A;
    private final aafq B;
    public final Context a;
    public final afzc b;
    public final zqm c;
    public final ctfq d;
    public final fdjx e;
    public final fcyh f;
    public final fcyh g;
    public final arhm h;
    public final Optional i;
    public final Optional j;
    public final ConcurrentHashMap k;
    public final fdap l;
    public final fdap m;
    public final fdat n;
    private final cqmb p;
    private final cwmr q;
    private final cdrx r;
    private final zez s;
    private final cmvy t;
    private final apql u;
    private final cult v;
    private final aqkc w;
    private final aqkj x;
    private final aqkb y;
    private final fcsu z;

    public zgh(Context context, cqmb cqmbVar, cwmr cwmrVar, cdrx cdrxVar, aafq aafqVar, afzc afzcVar, zez zezVar, zqm zqmVar, cmvy cmvyVar, apql apqlVar, ctfq ctfqVar, fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, cult cultVar, arhm arhmVar, aqkc aqkcVar, aqkj aqkjVar, aqkb aqkbVar, fcsu fcsuVar, ardm ardmVar, Optional optional, Optional optional2) {
        context.getClass();
        cqmbVar.getClass();
        cwmrVar.getClass();
        afzcVar.getClass();
        zqmVar.getClass();
        cmvyVar.getClass();
        apqlVar.getClass();
        ctfqVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        cultVar.getClass();
        ardmVar.getClass();
        this.a = context;
        this.p = cqmbVar;
        this.q = cwmrVar;
        this.r = cdrxVar;
        this.B = aafqVar;
        this.b = afzcVar;
        this.s = zezVar;
        this.c = zqmVar;
        this.t = cmvyVar;
        this.u = apqlVar;
        this.d = ctfqVar;
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.g = fcyhVar2;
        this.v = cultVar;
        this.h = arhmVar;
        this.w = aqkcVar;
        this.x = aqkjVar;
        this.y = aqkbVar;
        this.z = fcsuVar;
        this.A = ardmVar;
        this.i = optional;
        this.j = optional2;
        this.k = new ConcurrentHashMap();
        this.l = auxh.a(new zgc(this), 1000L, fdjxVar);
        this.m = auxh.a(new zgd(this), 1000L, fdjxVar);
        this.n = auxh.d(new zgf(this), fdjxVar);
    }

    public static final List e(List list) {
        zgg zggVar = new zgg();
        final fdat fdatVar = new fdat() { // from class: zfh
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                dijs dijsVar;
                dijs dijsVar2;
                diip diipVar = (diip) obj;
                boolean z = diipVar instanceof diin;
                diip diipVar2 = (diip) obj2;
                int i = 0;
                if (z && ((diin) diipVar).a == dijs.q) {
                    if ((diipVar2 instanceof diim) || ((diipVar2 instanceof diin) && ((dijsVar2 = ((diin) diipVar2).a) == dijs.p || dijsVar2 == dijs.n || dijsVar2 == dijs.o))) {
                        i = 1;
                    }
                } else if ((diipVar2 instanceof diin) && ((diin) diipVar2).a == dijs.q && ((diipVar instanceof diim) || (z && ((dijsVar = ((diin) diipVar).a) == dijs.p || dijsVar == dijs.n || dijsVar == dijs.o)))) {
                    i = -1;
                }
                return Integer.valueOf(i);
            }
        };
        Comparator comparatorThenComparing = Comparator.EL.thenComparing(zggVar, new java.util.Comparator() { // from class: zfi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) fdatVar.a(obj, obj2)).intValue();
            }
        });
        final fdat fdatVar2 = new fdat() { // from class: zfj
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                diip diipVar = (diip) obj;
                diip diipVar2 = (diip) obj2;
                return Integer.valueOf(diipVar.a() <= diipVar2.b() ? -1 : diipVar2.a() <= diipVar.b() ? 1 : fdbq.a(diipVar2.a(), diipVar.a()));
            }
        };
        java.util.Comparator comparatorThenComparing2 = Comparator.EL.thenComparing(comparatorThenComparing, new java.util.Comparator() { // from class: zfk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) fdatVar2.a(obj, obj2)).intValue();
            }
        });
        comparatorThenComparing2.getClass();
        return fcva.al(list, comparatorThenComparing2);
    }

    private final String f(zfd zfdVar) {
        StringBuilder sb = new StringBuilder();
        amwf amwfVar = zfdVar.a;
        if (zgi.b(amwfVar)) {
            sb.append(this.a.getResources().getString(R.string.urgent_indicator));
            sb.append("\n");
        }
        cmvy cmvyVar = this.t;
        Context context = this.a;
        String strC = cmvyVar.c(context.getResources(), zgi.a(amwfVar));
        boolean zIsEmpty = TextUtils.isEmpty(amwfVar.c());
        if (!TextUtils.isEmpty(strC)) {
            sb.append(context.getResources().getString(R.string.conversation_message_view_subject_text));
            sb.append(strC);
            if (!zIsEmpty) {
                sb.append("\n");
                sb.append(amwfVar.c());
            }
        } else if (!zIsEmpty) {
            sb.append(amwfVar.c());
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            ekrd ekrdVar = (ekrd) o.i();
            ekrdVar.X(cqnc.c, zfdVar.s);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/TextBubbleUiAdapter", "generateFullMessage", 322, "TextBubbleUiAdapter.kt")).w("Detected an empty text message. Message length=%s, subject length=%s", amwfVar.c().length(), strC != null ? Integer.valueOf(strC.length()) : null);
        }
        return string;
    }

    private final boolean g(String str) {
        cqmb cqmbVar = this.p;
        return cqmbVar.f() && str != null && str.length() != 0 && cqmbVar.g(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.auyl a(final defpackage.fdjx r32, final defpackage.zfd r33) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgh.a(fdjx, zfd):auyl");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r23, java.lang.String r24, defpackage.zfd r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgh.b(android.content.Context, java.lang.String, zfd, fcxy):java.lang.Object");
    }

    public final List c(zfd zfdVar, String str) {
        fcww fcwwVar = new fcww((byte[]) null);
        ynj ynjVar = zfdVar.m;
        if (ynjVar != null) {
            fcwwVar.addAll(fcva.ao(this.B.a(ynjVar.b, str, ynjVar.a)));
        }
        return fcva.a(fcwwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dlhm d(defpackage.zfd r23, java.lang.String r24, java.util.List r25, defpackage.fdae r26) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgh.d(zfd, java.lang.String, java.util.List, fdae):dlhm");
    }
}
