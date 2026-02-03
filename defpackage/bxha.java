package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxha extends bxge {
    public bxha(Context context, bxhb bxhbVar) {
        super(context, bxhbVar);
    }

    @Override // defpackage.bxge
    protected bxgh h(List list) {
        bxgk bxgkVarG;
        eieu eieuVarK = eiiy.k("UriImageRequest.loadMediaInternal");
        try {
            bxgh bxghVarH = super.h(list);
            if (((bxhb) this.b).l && (bxgkVarG = bxghVarH.g(this)) != null) {
                list.add(bxgkVarG);
                if (bxghVarH instanceof bxfz) {
                    ((bxfz) bxghVarH).b = false;
                }
            }
            eieuVarK.close();
            return bxghVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxge
    protected InputStream i() {
        Uri uriA = ((bxhb) this.b).a();
        if (uriA != null) {
            return this.a.getContentResolver().openInputStream(uriA);
        }
        return null;
    }
}
