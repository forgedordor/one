package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzae {
    private final dvdg a;
    private final Context b;

    public dzae(dvdg dvdgVar, Context context) {
        this.a = dvdgVar;
        this.b = context;
    }

    final ListenableFuture a(dzad dzadVar, String str, int i) {
        eiju eijuVarG = eiju.g(dzadVar.a(this.a.a(new Account(str, "com.google")), new dvda(fbgn.a.get().a(this.b)), dyyk.a(i)));
        ejvr ejvrVar = new ejvr() { // from class: dyzy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarH = eijuVarG.e(dvdi.class, ejvrVar, eoqgVar).f(dcff.class, new eooz() { // from class: dyzz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dcff dcffVar = (dcff) obj;
                return dcffVar.a() == 17 ? eork.h(new MdiNotAvailableException.ApiNotConnectedException()) : eork.h(dcffVar);
            }
        }, eoqgVar).f(IOException.class, new eooz() { // from class: dzaa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                IOException iOException = (IOException) obj;
                dcff dcffVar = (dcff) dyqf.b(iOException, dcff.class);
                return (dcffVar == null || dcffVar.a() != 10) ? eork.h(iOException) : eork.h(new MdiNotAvailableException.DeveloperErrorException());
            }
        }, eoqgVar).h(new ejvr() { // from class: dzab
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            }
        }, eoqgVar);
        eika.l(eijuVarH, new dzac(), eoqgVar);
        return eijuVarH;
    }
}
