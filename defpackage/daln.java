package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daln implements cmut {
    private final cmum a;

    public daln(cmum cmumVar) {
        this.a = cmumVar;
    }

    private final int e(int i) {
        return this.a.a(i).a;
    }

    private static btyd f(final int i) {
        cqaz.h();
        btys btysVarA = btyx.a();
        btysVarA.A("getCursorForSim");
        btysVarA.c(new Function() { // from class: dalk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btyw btywVar = (btyw) obj;
                btywVar.b(i);
                return btywVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btyc[] btycVarArr = {(btyc) new Function() { // from class: dall
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btyb) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(btyx.c)};
        int iIntValue = btyx.c().intValue();
        if (((Integer) btyx.b.getOrDefault(btycVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        btysVarA.m(btycVarArr);
        return (btyd) btysVarA.b().p();
    }

    private final String g(int i) {
        btyd btydVarF = f(e(i));
        try {
            String strE = btydVarF.moveToFirst() ? btydVarF.e() : null;
            btydVarF.close();
            return strE;
        } catch (Throwable th) {
            try {
                btydVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cmut
    public final String a(int i) {
        return g(i);
    }

    @Override // defpackage.cmut
    public final String b(int i, ConversationIdType conversationIdType) {
        String strG = g(i);
        if (strG != null || conversationIdType.b()) {
            return strG;
        }
        cqaz.h();
        return (String) botm.j(conversationIdType, new Function() { // from class: dalm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bojh) obj).ag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cmut
    public final boolean c(int i) {
        return this.a.a(i).b.getBoolean("allowEditingSmscAddress", false);
    }

    @Override // defpackage.cmut
    public final boolean d(int i, String str) {
        if (!c(i) || Objects.equals(str, g(i))) {
            return false;
        }
        String strTrim = str != null ? str.trim() : null;
        String str2 = true != TextUtils.isEmpty(strTrim) ? strTrim : null;
        cqaz.h();
        int iE = e(i);
        btyd btydVarF = f(iE);
        try {
            int count = btydVarF.getCount();
            btydVarF.close();
            if (count <= 0) {
                String[] strArr = btyx.a;
                btxi btxiVar = new btxi();
                btxiVar.h(iE);
                btxiVar.g(str2);
                axjq.a(btxiVar.a());
                return true;
            }
            String[] strArr2 = btyx.a;
            btyu btyuVar = new btyu();
            btyuVar.ap("setSmsServiceCenterForSim");
            int iIntValue = btyx.c().intValue();
            int iIntValue2 = btyx.c().intValue();
            if (iIntValue2 < 29080) {
                dqru.x("smsc", iIntValue2);
            }
            if (iIntValue >= 29080) {
                dqru.v(btyuVar.a, "smsc", str2);
            }
            return btyuVar.a(iE) > 0;
        } catch (Throwable th) {
            try {
                btydVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
