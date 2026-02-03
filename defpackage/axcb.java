package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcb {
    public static final List a(final int i, final String str) {
        axem axemVarA = axer.a();
        axemVarA.A("MyIdentityTablesOperations#getExistingSubRecords");
        axemVarA.c(new Function() { // from class: axca
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axeq axeqVar = (axeq) obj;
                axeqVar.d(i);
                axeqVar.c(str);
                return axeqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = axemVarA.b().z();
        ekgbVarZ.getClass();
        return ekgbVarZ;
    }

    public static final axav b(String str) {
        String[] strArr;
        String[] strArr2 = axay.a;
        Integer numB = axay.b();
        if (numB.intValue() == Integer.MAX_VALUE) {
            strArr = axay.a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("my_identities.token");
            if (numB.intValue() >= 60530) {
                ekfwVar.h("my_identities.canonical_token");
            }
            if (numB.intValue() >= 60810) {
                ekfwVar.h("my_identities.provisioning_id_v2");
            }
            if (numB.intValue() >= 60810) {
                ekfwVar.h("my_identities.is_verified_v2");
            }
            if (numB.intValue() >= 59980) {
                ekfwVar.h("my_identities.address_type");
            }
            ekfwVar.h("my_identities.phone_number");
            if (numB.intValue() >= 60120) {
                ekfwVar.h("my_identities.display_name");
            }
            ekfwVar.h("group_concat(quote(subscriptions.sub_id), '|')");
            ekfwVar.h("group_concat(quote(subscriptions.sim_serial_number), '|')");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        axav axavVar = new axav(strArr);
        axavVar.A(str);
        axavVar.o("JOIN_SUBSTITUTION_KEY", "token=my_identity_token_with_foreign_key");
        return axavVar;
    }

    public static final void c(awxe awxeVar, String str) {
        if (str.length() == 0) {
            return;
        }
        int iIntValue = awxh.c().intValue();
        int iIntValue2 = awxh.c().intValue();
        if (iIntValue2 < 60120) {
            dqru.x("display_name", iIntValue2);
        }
        if (iIntValue >= 60120) {
            dqru.v(awxeVar.a, "display_name", str);
        }
    }

    public static final void d(awvu awvuVar, String str) {
        if (str.length() == 0) {
            return;
        }
        awvuVar.h(str);
    }

    public static final void e(awxe awxeVar, String str) {
        if (str.length() == 0) {
            return;
        }
        int iIntValue = awxh.c().intValue();
        int iIntValue2 = awxh.c().intValue();
        if (iIntValue2 < 60810) {
            dqru.x("provisioning_id_v2", iIntValue2);
        }
        if (iIntValue >= 60810) {
            dqru.v(awxeVar.a, "provisioning_id_v2", str);
        }
    }
}
