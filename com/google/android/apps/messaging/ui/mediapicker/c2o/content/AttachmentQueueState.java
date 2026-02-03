package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import defpackage.bago;
import defpackage.bagr;
import defpackage.bvdr;
import defpackage.cgwx;
import defpackage.cyux;
import defpackage.cywn;
import defpackage.cywo;
import defpackage.cyyq;
import defpackage.eeji;
import defpackage.uig;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AttachmentQueueState implements Parcelable, bago {
    public static final Parcelable.Creator<AttachmentQueueState> CREATOR = new cywn();
    public List a;
    public cyyq b;
    private final List c;
    private int d;
    private final MessagePartDataConverter e;

    public AttachmentQueueState(Parcel parcel) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        ArrayList arrayList = parcel.readArrayList(MediaContentItem.class.getClassLoader());
        if (arrayList != null) {
            this.a = arrayList;
        }
        this.d = parcel.readInt();
        this.e = (MessagePartDataConverter) parcel.readParcelable(MessagePartDataConverter.class.getClassLoader());
    }

    public static MediaContentItem g(uig uigVar) {
        if (!(uigVar instanceof GalleryContent)) {
            return null;
        }
        GalleryContent galleryContent = (GalleryContent) uigVar;
        return new GalleryContentItem(galleryContent.e(), galleryContent.b(), galleryContent.f().getWidth(), galleryContent.f().getHeight(), ((Long) galleryContent.k().orElse(-1L)).longValue(), galleryContent.j(), galleryContent.a(), galleryContent.i());
    }

    public static boolean j(MediaContentItem mediaContentItem) {
        return (mediaContentItem instanceof GalleryContentItem) && ((GalleryContentItem) mediaContentItem).f.equals(bvdr.GOOGLE_PHOTOS_LINK);
    }

    private final void p(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaContentItem mediaContentItemA = this.e.a((MessagePartCoreData) it.next());
            if (mediaContentItemA != null) {
                int iIndexOf = this.a.indexOf(mediaContentItemA);
                if (iIndexOf >= 0) {
                    arrayList.add((MediaContentItem) this.a.get(iIndexOf));
                } else {
                    arrayList.add(mediaContentItemA);
                }
            }
        }
        this.a = arrayList;
    }

    @Override // defpackage.bago
    public final void b(bagr bagrVar, int i) {
        if ((i & 1) == 1) {
            if (((Boolean) cyux.a.e()).booleanValue() || bagrVar.p.size() != this.a.size()) {
                this.d = bagrVar.l();
                p(bagrVar.p);
                i();
            }
        }
    }

    public final int c(Class cls) {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (cls.isInstance((MediaContentItem) it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(uig uigVar) {
        MediaContentItem mediaContentItemG = g(uigVar);
        mediaContentItemG.getClass();
        return this.a.indexOf(mediaContentItemG);
    }

    @Deprecated
    public final int f(MediaContentItem mediaContentItem) {
        return this.a.indexOf(mediaContentItem);
    }

    public final void h(cywo cywoVar) {
        this.c.add(cywoVar);
    }

    public final void i() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((cywo) it.next()).a(this);
        }
    }

    public final boolean k(uig uigVar) {
        return e(uigVar) != -1;
    }

    @Deprecated
    public final boolean l(MediaContentItem mediaContentItem) {
        return f(mediaContentItem) != -1;
    }

    @Deprecated
    public final boolean m(MediaContentItem mediaContentItem) {
        if (!((Boolean) cgwx.a.e()).booleanValue() ? this.a.size() >= this.d : !(j(mediaContentItem) || ((int) Collection.EL.stream(this.a).filter(new Predicate() { // from class: cywk
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !AttachmentQueueState.j((MediaContentItem) obj);
            }
        }).count()) < this.d)) {
            this.a.add(mediaContentItem);
            i();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((cywo) it.next()).b();
            }
            return true;
        }
        cyyq cyyqVar = this.b;
        if (cyyqVar == null) {
            return false;
        }
        eeji eejiVar = new eeji(cyyqVar.a.k);
        eejiVar.u(R.string.mms_attachment_limit_reached);
        eejiVar.k(R.string.attachment_limit_reached_dialog_message_when_composing);
        eejiVar.r(android.R.string.ok, null);
        eejiVar.a();
        return false;
    }

    public final boolean n(uig uigVar) {
        MediaContentItem mediaContentItemG = g(uigVar);
        mediaContentItemG.getClass();
        return m(mediaContentItemG);
    }

    @Deprecated
    public final void o(MediaContentItem mediaContentItem) {
        if (this.a.indexOf(mediaContentItem) >= 0) {
            this.a.remove(mediaContentItem);
            i();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public AttachmentQueueState(bagr bagrVar, MessagePartDataConverter messagePartDataConverter) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.e = messagePartDataConverter;
        this.d = bagrVar.l();
        p(bagrVar.p);
    }

    public AttachmentQueueState(MessagePartDataConverter messagePartDataConverter) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.e = messagePartDataConverter;
        this.a = new ArrayList();
        this.d = 10;
    }

    @Override // defpackage.bago
    public final void a() {
    }

    @Override // defpackage.bago
    public final void d(bagr bagrVar) {
    }
}
