package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uii {
    public amyb h = null;

    public abstract GalleryContent a();

    public abstract elha b();

    public abstract Optional c();

    public abstract String d();

    public abstract void e(elha elhaVar);

    public abstract void f(String str);

    public abstract void g(long j);

    public abstract void h(boolean z);

    public abstract void i(long j);

    public abstract void j(bvdr bvdrVar);

    public abstract void k(Uri uri);

    public final GalleryContent l() {
        if (le.w(d())) {
            f("application/txt");
        }
        h(((Boolean) c().orElse(Boolean.valueOf(b() != elha.FILE_CHOOSER))).booleanValue());
        final GalleryContent galleryContentA = a();
        galleryContentA.p.set(this.h);
        ((uhv) galleryContentA).i.ifPresent(new Consumer() { // from class: uih
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                if (((Long) obj).longValue() <= 0) {
                    GalleryContent galleryContent = galleryContentA;
                    eksl ekslVar = (eksl) GalleryContent.o.i();
                    ekslVar.Z(eksk.FULL);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/conversation/draft/model/GalleryContent$Builder", "build", 156, "GalleryContent.java")).r("GalleryContent with invalid duration from source: %d", ((uhv) galleryContent).c.a());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return galleryContentA;
    }
}
