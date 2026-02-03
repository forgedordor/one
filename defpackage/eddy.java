package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eddy {
    public static final ekhx a = ekhx.s("android.resource", "content", "file");
    private final ejwi b;
    private final Resources c;
    private final drjk d = new drjk();

    public eddy(ejwi ejwiVar, Resources resources) {
        this.b = ejwiVar;
        this.c = resources;
    }

    private static rbr i(rbr rbrVar) {
        return (rbr) rbrVar.D(fbgv.a.get().n() ? rha.e : rha.c);
    }

    private final rbr j(rbr rbrVar, edea edeaVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = edeaVar.a.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((eddz) it.next()).ordinal();
            if (iOrdinal == 0) {
                arrayList.add(new rnv());
            } else if (iOrdinal == 1) {
                arrayList.add(new rpi(this.c.getDimensionPixelSize(R.dimen.photo_picker_corner_crop_radius)));
            } else if (iOrdinal == 2) {
                arrayList.add(new rnx());
            } else if (iOrdinal == 3) {
                arrayList.add(new ros());
            } else if (iOrdinal == 4) {
                arrayList.add(new rnw());
            }
        }
        return (rbr) rbrVar.Z((rfb[]) arrayList.toArray(new rns[0]));
    }

    private final rbr k(Context context, Uri uri, edea edeaVar) {
        return b(raw.c(context).b(), uri, edeaVar);
    }

    public final rbr a(Context context, Uri uri, edea edeaVar) {
        return b(raw.c(context).c(), uri, edeaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [eddt] */
    public final rbr b(rbr rbrVar, Uri uri, edea edeaVar) {
        Set set = edeaVar.a;
        if (set.contains(eddz.FORCE_SOFTWARE_BITMAP)) {
            rbrVar = (rbr) rbrVar.C();
        }
        rbr rbrVarI = i(j(rbrVar, edeaVar));
        if (this.d.b(uri)) {
            drfz drfzVar = new drfz();
            if (set.contains(eddz.CENTER_CROP)) {
                drfzVar.b(VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
            }
            if (set.contains(eddz.FORCE_MONOGRAM)) {
                drfzVar.b(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            }
            ejwi ejwiVar = this.b;
            uri = new eddt(new drfl(uri.toString(), drfzVar, ejwiVar.g() ? ((Integer) ((eddm) ejwiVar.c()).a.e(-1)).intValue() : -1));
        }
        return (rbr) rbrVarI.k(uri).V(rmx.a, 7500);
    }

    public final void c(ImageView imageView) {
        raw.e(imageView).k(imageView);
    }

    public final void d(Bitmap bitmap, edea edeaVar, ImageView imageView) {
        i(j(raw.c(imageView.getContext()).c(), edeaVar)).g(bitmap).v(imageView);
    }

    public final void e(Context context, Uri uri, edea edeaVar, rua ruaVar, rti rtiVar) {
        rbr rbrVarK = k(context, uri, edeaVar);
        if (a.contains(uri.getScheme())) {
            rbrVarK = (rbr) ((rbr) rbrVarK.D(rha.c)).ai();
        }
        ((rbr) rbrVarK.a(rtiVar).z()).w(ruaVar);
    }

    public final void f(Uri uri, edea edeaVar, ImageView imageView) {
        ((rbr) a(imageView.getContext(), uri, edeaVar).T(rbh.NORMAL)).v(imageView);
    }

    public final void g(Uri uri, edea edeaVar, SquareImageView squareImageView) {
        h(uri, edeaVar, squareImageView, rbh.NORMAL);
    }

    public final void h(Uri uri, edea edeaVar, SquareImageView squareImageView, rbh rbhVar) {
        ((rbr) k(squareImageView.getContext(), uri, edeaVar).T(rbhVar)).w(squareImageView.b);
    }
}
