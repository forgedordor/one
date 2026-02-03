package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjf implements acin {
    private final Context a;
    private final eosc b;

    public acjf(Context context, eosc eoscVar) {
        this.a = context;
        this.b = eoscVar;
    }

    @Override // defpackage.acin
    public final eiju a() {
        return eijx.e(new HashMap());
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return eijx.g(new Callable() { // from class: acje
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                String[] strArr = bspe.a;
                bsoz bsozVar = new bsoz(bspe.a);
                bsozVar.A("getUnredactedPhoneNumberPsbd");
                bsozVar.k(new bspc((bspd) new Function() { // from class: acjd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bspd bspdVar = (bspd) obj;
                        bspdVar.ap(new dqpn("pii_hash.hash_key", 6));
                        bspdVar.ap(new dqpn("pii_hash.hash_value", 6));
                        return bspdVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bspd())));
                bson bsonVar = bspe.c;
                bsoo[] bsooVarArr = {bsonVar.d, bsonVar.c};
                int iA = bspe.b().a();
                Integer.valueOf(iA).getClass();
                for (int i = 0; i < 2; i++) {
                    if (((Integer) bspe.b.getOrDefault(bsooVarArr[i].toString(), -1)).intValue() > iA) {
                        dqru.x("columnReference.toString()", iA);
                    }
                }
                bsozVar.m(bsooVarArr);
                bsop bsopVar = (bsop) bsozVar.b().p();
                while (bsopVar.moveToNext()) {
                    try {
                        String strC = bsopVar.c();
                        String strE = bsopVar.e();
                        strC.getClass();
                        strE.getClass();
                        sb.append("original = ");
                        sb.append(strC);
                        sb.append(", hashValue = ");
                        sb.append(strE);
                        sb.append("\n");
                    } catch (Throwable th) {
                        try {
                            bsopVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bsopVar.close();
                if (TextUtils.isEmpty(sb.toString())) {
                    sb.append("No unredacted phone number.\n");
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "unredacted_phone_number"));
                return arrayList;
            }
        }, this.b);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }

    @Override // defpackage.acin
    public final elhx e() {
        return elhx.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNREDACTED_PHONE_NUMBERS;
    }

    @Override // defpackage.acin
    public final String f() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_description);
    }

    @Override // defpackage.acin
    public final String g() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_detail_title);
    }

    @Override // defpackage.acin
    public final String h() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_name);
    }

    @Override // defpackage.acin
    public final String i() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_rationale);
    }

    @Override // defpackage.acin
    public final String j() {
        return this.a.getString(R.string.unredacted_phone_number_feedback_data_rationale_title);
    }
}
