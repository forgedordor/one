package defpackage;

import android.database.Cursor;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbc extends czbd {
    public czbc(Cursor cursor) {
        super(cursor);
    }

    @Override // defpackage.czbd
    public final GalleryContent b(elha elhaVar) {
        uii uiiVarO = GalleryContent.o();
        uiiVarO.k(this.d);
        uiiVarO.f(this.a);
        ((uhu) uiiVarO).a = new Size(this.e, this.f);
        uiiVarO.e(elhaVar);
        uiiVarO.i(this.b);
        return uiiVarO.l();
    }

    @Override // defpackage.czbd
    public final GalleryContentItem c(elha elhaVar) {
        return new GalleryContentItem(this.d, this.a, this.e, this.f, -1L, elhaVar, this.b);
    }

    @Override // defpackage.czbd, defpackage.czbb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czbc) {
            return super.equals(obj);
        }
        return false;
    }
}
