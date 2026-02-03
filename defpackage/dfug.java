package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dfug implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessagingResult apply(dgza dgzaVar) {
        effe effeVarD = MessagingResult.d();
        b(dgzaVar, effeVarD);
        effeVarD.b(dgzaVar.a());
        effeVarD.d(dgzaVar.c());
        return effeVarD.e();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public void b(dgza dgzaVar, effe effeVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
