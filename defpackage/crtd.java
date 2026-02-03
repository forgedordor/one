package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtd implements crsx {
    public final fdjx b;
    public final Context c;
    private final fcsu f;
    private static final ekhx d = ekhx.r("com.google.android.apps.messaging.ui.conversationlist.SHARE_TARGET_CATEGORY", "com.google.android.apps.messaging.ui.conversationlist.VIDEO_SHARE_TARGET_CATEGORY");
    private static final cqce e = cqce.g("Bugle", "ShortcutManagerWrapperImpl");
    public static final feav a = new feaz();

    public crtd(fdjx fdjxVar, Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fdjxVar;
        this.c = context;
        this.f = fcsuVar2;
        int i = kyg.a;
        kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).getMaxShortcutCountPerActivity();
    }

    @Override // defpackage.crsx
    public final String a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        String strA = conversationIdType.a();
        strA.getClass();
        return strA;
    }

    @Override // defpackage.crsx
    public final boolean b(final String str) {
        try {
            Stream stream = Collection.EL.stream(kyg.c(this.c, true != craf.d ? 7 : 15));
            final fdap fdapVar = new fdap() { // from class: crsy
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    kyd kydVar = (kyd) obj;
                    feav feavVar = crtd.a;
                    kydVar.getClass();
                    return kydVar.b;
                }
            };
            Stream map = stream.map(new Function() { // from class: crsz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    feav feavVar = crtd.a;
                    return fdapVar.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final fdap fdapVar2 = new fdap() { // from class: crta
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    feav feavVar = crtd.a;
                    return Boolean.valueOf(fdbq.f(str, (String) obj));
                }
            };
            return map.anyMatch(new Predicate() { // from class: crtb
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    feav feavVar = crtd.a;
                    return ((Boolean) fdapVar2.invoke(obj)).booleanValue();
                }
            });
        } catch (RuntimeException e2) {
            e.s("Failed to get shortcuts: ", e2);
            return false;
        }
    }

    @Override // defpackage.crsx
    public final kyd c(Context context, ConversationId conversationId, String str, IconCompat iconCompat, String str2, int i) {
        context.getClass();
        conversationId.getClass();
        str.getClass();
        Integer numValueOf = Integer.valueOf(i);
        Intent intentO = ((avmp) this.f.b()).o(context, conversationId, null, false);
        intentO.getClass();
        intentO.setFlags(0);
        intentO.setAction("android.intent.action.MAIN");
        intentO.putExtra("via_shortcut", true);
        kxg kxgVar = new kxg(context);
        kxgVar.e(intentO);
        PersistableBundle persistableBundle = new PersistableBundle(1);
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.unknown_shortcut_label);
            str.getClass();
        }
        kyd kydVar = new kyd();
        kydVar.a = context;
        kydVar.b = str2;
        kydVar.e = str;
        kydVar.c = kxgVar.c();
        kydVar.g = context.getText(R.string.shortcut_disabled_text);
        kydVar.m = 2147483646;
        kydVar.n = persistableBundle;
        numValueOf.getClass();
        if (i != 2147483646) {
            numValueOf.getClass();
            kydVar.m = i;
            ekhx ekhxVar = d;
            css cssVar = new css();
            cssVar.addAll(ekhxVar);
            kydVar.j = cssVar;
        }
        if (iconCompat != null) {
            kydVar.h = iconCompat;
        }
        if (craf.d) {
            kydVar.l = true;
        }
        kyc.a(kydVar, null, null);
        return kydVar;
    }
}
