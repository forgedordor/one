package defpackage;

import com.google.android.rcs.client.messaging.data.GroupInformation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efov implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjhu apply(GroupInformation groupInformation) {
        cjht cjhtVar = (cjht) cjhu.a.createBuilder();
        String strE = groupInformation.e();
        cjhtVar.copyOnWrite();
        cjhu cjhuVar = (cjhu) cjhtVar.instance;
        cjhuVar.b |= 1;
        cjhuVar.c = strE;
        e(groupInformation, cjhtVar);
        b(groupInformation, cjhtVar);
        c(groupInformation, cjhtVar);
        d(groupInformation, cjhtVar);
        if (groupInformation.c().isPresent()) {
            f(groupInformation, cjhtVar);
        }
        return (cjhu) cjhtVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(GroupInformation groupInformation, cjht cjhtVar);

    public void c(GroupInformation groupInformation, cjht cjhtVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(GroupInformation groupInformation, cjht cjhtVar);

    public void e(GroupInformation groupInformation, cjht cjhtVar) {
        throw null;
    }

    public abstract void f(GroupInformation groupInformation, cjht cjhtVar);
}
