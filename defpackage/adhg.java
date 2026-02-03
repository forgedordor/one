package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adhg extends fcyz implements fdap {
    int a;
    final /* synthetic */ adhk b;
    final /* synthetic */ GalleryContent c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adhg(adhk adhkVar, GalleryContent galleryContent, int i, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = adhkVar;
        this.c = galleryContent;
        this.d = i;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        adhk adhkVar = this.b;
        GalleryContent galleryContent = this.c;
        int i2 = this.d;
        this.a = 1;
        Object objB = adhkVar.b(galleryContent, i2, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new adhg(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
