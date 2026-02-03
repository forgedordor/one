package defpackage;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpjp {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final cpiz e;
    public final fcsu f;
    public final cpgf g;
    public final bxlc h;
    public final dqsn i;
    public final fcsu j;
    public final fcsu k;
    public final fdjx l;
    public final fcsu m;
    private final fcsu n;

    public cpjp(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cpiz cpizVar, fcsu fcsuVar5, cpgf cpgfVar, bxlc bxlcVar, fcsu fcsuVar6, dqsn dqsnVar, fcsu fcsuVar7, fcsu fcsuVar8, fdjx fdjxVar, fcsu fcsuVar9) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cpizVar.getClass();
        fcsuVar5.getClass();
        cpgfVar.getClass();
        bxlcVar.getClass();
        fcsuVar6.getClass();
        dqsnVar.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fdjxVar.getClass();
        fcsuVar9.getClass();
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = cpizVar;
        this.f = fcsuVar5;
        this.g = cpgfVar;
        this.h = bxlcVar;
        this.n = fcsuVar6;
        this.i = dqsnVar;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
        this.l = fdjxVar;
        this.m = fcsuVar9;
    }

    public static final Boolean g(String str) throws IOException {
        eieu eieuVarA = eiiy.a("DestinationBlocker#isBlockedDestinationInBugleDb");
        try {
            String[] strArr = ParticipantsTable.a;
            bsbx bsbxVar = new bsbx();
            bsbxVar.r(str);
            Pattern pattern = cssr.a;
            if (!TextUtils.isEmpty(str) && ((pattern != null && pattern.matcher(str).find()) || PhoneNumberUtils.isGlobalPhoneNumber(str))) {
                bsbx bsbxVar2 = new bsbx();
                bsbxVar2.ar(new dqxl("PHONE_NUMBERS_EQUAL($V, $V, 0)", new Object[]{ParticipantsTable.c.f, str}));
                bsbx bsbxVar3 = new bsbx();
                bsbxVar3.aq(bsbxVar, bsbxVar2);
                bsbxVar = bsbxVar3;
            }
            bsbxVar.v(-2);
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("+isBlockedDestinationInBugleDb");
            bsboVarE.e(new Function() { // from class: cpja
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brzh brzhVar = (brzh) obj;
                    eksp ekspVar = cpjp.a;
                    return new brzi[]{brzhVar.v, brzhVar.f, brzhVar.h, brzhVar.z};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsboVarE.g(bsbxVar);
            dqqj dqqjVarP = bsboVarE.b().p();
            try {
                brzj brzjVar = (brzj) dqqjVarP;
                if (brzjVar.getCount() == 0) {
                    fczl.a(dqqjVarP, null);
                    fczl.a(eieuVarA, null);
                    return null;
                }
                while (brzjVar.moveToNext()) {
                    if (brzjVar.r()) {
                        fczl.a(dqqjVarP, null);
                        fczl.a(eieuVarA, null);
                        return true;
                    }
                }
                fczl.a(dqqjVarP, null);
                fczl.a(eieuVarA, null);
                return false;
            } finally {
            }
        } finally {
        }
    }

    private final void h(String str) {
        auvh.h(((cden) this.n.b()).b(new IllegalArgumentException(a.a(str, "Destination input to DestinationBlocker#", " is null or empty"))));
    }

    public final ParticipantsTable.BindData a(String str) {
        return ((bbca) this.c.b()).d(str);
    }

    public final cpjr b(final cpin cpinVar) {
        ecem.b();
        final cpjq cpjqVar = (cpjq) cpjr.a.createBuilder();
        cpjqVar.copyOnWrite();
        cpjr cpjrVar = (cpjr) cpjqVar.instance;
        cpjrVar.b |= 1;
        cpjrVar.c = cpinVar.b;
        cpjqVar.copyOnWrite();
        cpjr cpjrVar2 = (cpjr) cpjqVar.instance;
        cpjrVar2.b |= 8;
        cpjrVar2.f = cpinVar.c;
        cpjqVar.copyOnWrite();
        cpjr cpjrVar3 = (cpjr) cpjqVar.instance;
        cpjrVar3.b |= 16;
        cpjrVar3.g = cpinVar.d;
        int iA = eofq.a(cpinVar.h);
        cpjqVar.copyOnWrite();
        cpjr cpjrVar4 = (cpjr) cpjqVar.instance;
        cpjrVar4.b |= 32;
        cpjrVar4.h = iA;
        return (cpjr) this.i.c("DestinationBlocker#updateBlockStatus", new ejxr() { // from class: cpjh
            /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 448
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cpjh.get():java.lang.Object");
            }
        });
    }

    public final String c(String str) throws IOException {
        eieu eieuVarA = eiiy.a("DestinationBlocker#getDestinationForBlockCheck");
        try {
            ParticipantsTable.BindData bindDataC = ((bbca) this.c.b()).c(str);
            if (bindDataC != null) {
                String strO = bindDataC.O();
                if (!TextUtils.isEmpty(strO)) {
                    fczl.a(eieuVarA, null);
                    return strO;
                }
                auvh.h(((cden) this.n.b()).b(new IllegalArgumentException("Destination is Rbm but has no empty destination")));
            }
            fczl.a(eieuVarA, null);
            return str;
        } finally {
        }
    }

    public final boolean d(alqm alqmVar) {
        return e(alqmVar.m(true));
    }

    public final boolean e(String str) throws IOException {
        ecem.b();
        if (str == null || str.length() == 0) {
            h("isBlockedInBugleFallbackToTelephony");
            return false;
        }
        Boolean boolG = g(str);
        return boolG != null ? boolG.booleanValue() : f(str);
    }

    public final boolean f(String str) throws IOException {
        ecem.b();
        if (str.length() == 0) {
            h("isBlockedInTelephony");
            return false;
        }
        eieu eieuVarA = eiiy.a("DestinationBlocker#isBlocked");
        try {
            if (this.e.e()) {
                Optional optionalA = ((cpio) this.f.b()).a(c(str));
                if (optionalA.isPresent()) {
                    boolean zBooleanValue = ((Boolean) optionalA.get()).booleanValue();
                    fczl.a(eieuVarA, null);
                    return zBooleanValue;
                }
            }
            Boolean boolG = g(str);
            boolean zBooleanValue2 = boolG != null ? boolG.booleanValue() : false;
            fczl.a(eieuVarA, null);
            return zBooleanValue2;
        } finally {
        }
    }
}
