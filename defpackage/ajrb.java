package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ajrb {
    public static ajqy p() {
        ajqm ajqmVar = new ajqm();
        ajqmVar.d(false);
        ajqmVar.b(true);
        ajqmVar.g(embo.UNDEFINED);
        ajqmVar.g = 1;
        ajqmVar.h(8);
        return ajqmVar;
    }

    public static ajqy q(final brdu brduVar, Optional optional) {
        final ajqy ajqyVarP = p();
        r(new ajra() { // from class: ajqs
            @Override // defpackage.ajra
            public final void a() {
                ajqyVarP.h(brduVar.a());
            }
        }, optional, "missing terminal error status");
        r(new ajra() { // from class: ajqt
            @Override // defpackage.ajra
            public final void a() {
                ajqyVarP.e(brduVar.a.getAsInteger("raw_status").intValue());
            }
        }, optional, "missing raw telephony status");
        r(new ajra() { // from class: ajqu
            @Override // defpackage.ajra
            public final void a() {
                Integer asInteger = brduVar.a.getAsInteger("result_code");
                asInteger.intValue();
                ((ajqm) ajqyVarP).a = Optional.of(asInteger);
            }
        }, optional, "missing resultCode");
        r(new ajra() { // from class: ajqv
            @Override // defpackage.ajra
            public final void a() {
                Integer asInteger = brduVar.a.getAsInteger("sms_error_code");
                asInteger.intValue();
                ((ajqm) ajqyVarP).b = Optional.of(asInteger);
            }
        }, optional, "missing errorCode");
        r(new ajra() { // from class: ajqw
            @Override // defpackage.ajra
            public final void a() {
                ajqyVarP.d(brduVar.a.getAsBoolean("seen").booleanValue());
            }
        }, optional, "missing notified");
        r(new ajra() { // from class: ajqx
            @Override // defpackage.ajra
            public final void a() {
                ContentValues contentValues = brduVar.a;
                bvec[] bvecVarArrValues = bvec.values();
                int iIntValue = contentValues.getAsInteger("xms_transport").intValue();
                if (iIntValue >= bvecVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                ((ajqm) ajqyVarP).c = Optional.of(bvecVarArrValues[iIntValue]);
            }
        }, optional, "missing xmsTransport");
        return ajqyVarP;
    }

    private static void r(ajra ajraVar, Optional optional, final String str) {
        try {
            ajraVar.a();
        } catch (RuntimeException e) {
            optional.ifPresent(new Consumer() { // from class: ajqr
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cqbd cqbdVarA = ((cqce) obj).a();
                    cqbdVarA.I(str);
                    cqbdVarA.s(e);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public abstract int a();

    public abstract MessageIdType b();

    public abstract embo c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract void o();
}
