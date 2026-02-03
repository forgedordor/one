package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbe extends czbd {
    public final long g;

    public czbe(Context context, cqmz cqmzVar, Cursor cursor) {
        String strJ;
        super(cursor);
        this.g = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
        String path = ((Boolean) batt.a.e()).booleanValue() ? ContentUris.withAppendedId(batu.b, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))).getPath() : cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        if (path == null || (strJ = cqmz.j(context, Uri.parse(path))) == null || cqmzVar.l(strJ)) {
            return;
        }
        this.a = strJ;
    }

    @Override // defpackage.czbd
    public final GalleryContent b(elha elhaVar) {
        uii uiiVarO = GalleryContent.o();
        uiiVarO.k(this.d);
        uiiVarO.f(this.a);
        ((uhu) uiiVarO).a = new Size(this.e, this.f);
        uiiVarO.e(elhaVar);
        uiiVarO.i(this.b);
        long j = this.g;
        if (j > 0) {
            uiiVarO.g(j);
        }
        return uiiVarO.l();
    }

    @Override // defpackage.czbd
    public final GalleryContentItem c(elha elhaVar) {
        return new GalleryContentItem(this.d, this.a, this.e, this.f, this.g, elhaVar, this.b);
    }

    @Override // defpackage.czbd, defpackage.czbb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czbe) {
            return super.equals(obj) && this.g == ((czbe) obj).g;
        }
        return false;
    }

    @Override // defpackage.czbd, defpackage.czbb
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.g));
    }
}
