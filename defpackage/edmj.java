package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmj {
    public static final ekrg a = ekrg.c("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository");
    public final eosc c;
    public final dvdf d;
    public final eddo e;
    public final eddp f;
    public final edhj h;
    public edmi i;
    public edhm j;
    public final lvy b = new lvy();
    public final AtomicBoolean g = new AtomicBoolean(false);

    public edmj(eosc eoscVar, dvdf dvdfVar, eddo eddoVar, edhj edhjVar, eddp eddpVar) {
        this.c = eoscVar;
        this.d = dvdfVar;
        this.e = eddoVar;
        this.h = edhjVar;
        this.f = eddpVar;
        c(edhm.g());
    }

    public final void a(Throwable th) {
        edhe edheVar = this.f.a() ? edhe.NON_RETRYABLE : edhe.OFFLINE;
        edmi edmiVar = this.i;
        edmiVar.c.add(0, ((edhi) edmiVar.b.remove(edmiVar.a)).e(true != edmiVar.d.f.a() ? 15 : 3, th));
        c(edhm.f(edheVar, this.i.a()));
        this.g.set(false);
    }

    public final void b() {
        if (this.g.compareAndSet(false, true)) {
            e(exwf.OBAKE_MDI_READ);
            c(edhm.h());
            d();
        }
    }

    public final void c(edhm edhmVar) {
        ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/user/profile/photopicker/common/model/profile/MdiPhotoRepository", "post", 346, "MdiPhotoRepository.java")).t("post: %s", edhmVar);
        this.j = edhmVar;
        this.b.j(edhmVar);
    }

    public final void d() {
        dvdf dvdfVar = this.d;
        final ListenableFuture listenableFutureD = dvdfVar.d();
        final ListenableFuture listenableFutureE = dvdfVar.e(new dvda(true), 3);
        this.i.c(exwf.OBAKE_MDI_GET_PERSON_ME);
        this.i.c(exwf.OBAKE_MDI_GET_PERSON_PHOTO_ME);
        edme edmeVar = new edme(this);
        eoqg eoqgVar = eoqg.a;
        eork.r(listenableFutureD, edmeVar, eoqgVar);
        eork.r(listenableFutureE, new edmf(this), eoqgVar);
        eorg eorgVarB = eork.b(listenableFutureD, listenableFutureE);
        Callable callable = new Callable() { // from class: edma
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((InputStream) eork.q(listenableFutureE));
                ListenableFuture listenableFuture = listenableFutureD;
                efwh efwhVarA = dvgy.a((eucu) eork.q(listenableFuture));
                if (((euda) ((eucu) eork.q(listenableFuture)).b.get(0)).c == null) {
                    efvz efvzVar = efvz.a;
                }
                return new edlx(bitmapDecodeStream, efwhVarA.d, efwhVarA.e);
            }
        };
        eosc eoscVar = this.c;
        eork.r(eorgVarB.a(callable, eoscVar), new edmd(this), eoscVar);
    }

    public final void e(exwf exwfVar) {
        edmi edmiVar = new edmi(this);
        this.i = edmiVar;
        edmiVar.a = exwfVar;
        edmiVar.c(edmiVar.a);
    }
}
