package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class atae implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cous apply(couy couyVar) {
        eksp ekspVar = cous.h;
        couc coucVar = new couc();
        if ((couyVar.b & 64) != 0) {
            ejvj ejvjVar = atan.a;
            aubx aubxVar = couyVar.i;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            coucVar.d((ContentType) ejvjVar.fM(aubxVar));
        }
        b(couyVar, coucVar);
        if ((couyVar.b & 4) != 0) {
            coucVar.f(couyVar.e);
        }
        if ((couyVar.b & 256) != 0) {
            coucVar.g(couyVar.k);
        }
        if ((couyVar.b & 128) != 0) {
            ejvj ejvjVar2 = atan.a;
            aubx aubxVar2 = couyVar.j;
            if (aubxVar2 == null) {
                aubxVar2 = aubx.a;
            }
            coucVar.h((ContentType) ejvjVar2.fM(aubxVar2));
        }
        if ((couyVar.b & 8) != 0) {
            coucVar.i(couyVar.f);
        }
        return coucVar.j();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(couy couyVar, cour courVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
