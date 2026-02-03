package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axck implements ejxr {
    final /* synthetic */ cmmh a;
    final /* synthetic */ axcl b;
    final /* synthetic */ dggk c;

    public axck(cmmh cmmhVar, axcl axclVar, dggk dggkVar) {
        this.a = cmmhVar;
        this.b = axclVar;
        this.c = dggkVar;
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        eksp ekspVar = axcl.a;
        cmmh cmmhVar = this.a;
        int i = cmmhVar.d;
        String str = cmmhVar.n;
        str.getClass();
        axdh axdhVar = (axdh) fcva.Y(axcb.a(i, str));
        if ((axdhVar != null ? axdhVar.e() : null) == null) {
            eksl ekslVar = (eksl) axcl.a.j();
            ekslVar.X(cqnc.w, Integer.valueOf(cmmhVar.d));
            ekslVar.X(cqnc.x, cmmhVar.n);
            ekslVar.q("No Subscription record found matching the given subId and iccId");
            return null;
        }
        if (!this.b.c.a()) {
            final axcm axcmVarE = axdhVar.e();
            axcmVarE.getClass();
            dggk dggkVar = this.c;
            String[] strArr = awxh.a;
            awxe awxeVar = new awxe();
            awxeVar.ap("MyIdentityTablesOperations#setIdentitiesUnverified");
            final String str2 = dggkVar.a;
            awxeVar.f(new Function() { // from class: axbz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    awxg awxgVar = (awxg) obj;
                    awxgVar.g(axcmVarE);
                    awxgVar.c(str2);
                    awxgVar.d(true);
                    return awxgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            awxeVar.e(false);
            int iE = awxeVar.b().e();
            if (iE > 0) {
                eksl ekslVar2 = (eksl) axcl.a.j();
                ekslVar2.X(cqnc.I, str2);
                ekslVar2.r("MyIdentities were marked unverified (count: %s)", iE);
            }
        }
        final axcm axcmVarE2 = axdhVar.e();
        axcmVarE2.getClass();
        final String str3 = cmmhVar.c;
        str3.getClass();
        String[] strArr2 = awxh.a;
        awxe awxeVar2 = new awxe();
        awxeVar2.ap("MyIdentityTablesOperations#removeProvisioningIds");
        awxeVar2.f(new Function() { // from class: axby
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awxg awxgVar = (awxg) obj;
                awxgVar.g(axcmVarE2);
                awxgVar.e(str3);
                return awxgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        awxeVar2.a.putNull("provisioning_id_v2");
        awxeVar2.b().e();
        final axcm axcmVarE3 = axdhVar.e();
        axcmVarE3.getClass();
        final String str4 = cmmhVar.c;
        str4.getClass();
        dggk dggkVar2 = this.c;
        awxe awxeVar3 = new awxe();
        awxeVar3.ap("MyIdentityTablesOperations#updateAddressAndMarkVerified");
        awxeVar3.f(new Function() { // from class: axbs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awxg awxgVar = (awxg) obj;
                eksp ekspVar2 = axcl.a;
                awxgVar.f(axcmVarE3);
                awxgVar.e(str4);
                awxgVar.d(false);
                return awxgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String str5 = dggkVar2.a;
        awxeVar3.d(str5);
        awxeVar3.e(true);
        if (awxeVar3.b().e() <= 0) {
            return null;
        }
        eksl ekslVar3 = (eksl) axcl.a.h();
        ekslVar3.X(cqnc.ae, str4);
        ekslVar3.X(cqnc.I, str5);
        ekslVar3.q("Updated MyIdentity with verified address");
        return axcmVarE3;
    }
}
