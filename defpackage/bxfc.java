package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardEntry;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxfc implements bxhc {
    final CountDownLatch a;
    final /* synthetic */ bxfd b;

    public bxfc(bxfd bxfdVar, CountDownLatch countDownLatch) {
        this.b = bxfdVar;
        this.a = countDownLatch;
    }

    @Override // defpackage.bxhc
    public final void a() {
        bxfd bxfdVar = this.b;
        List list = bxfdVar.f;
        if (!list.isEmpty()) {
            bxfo bxfoVar = bxfdVar.b;
            String strF = bxfdVar.f();
            Context context = (Context) bxfoVar.a.b();
            context.getClass();
            cogw cogwVar = (cogw) bxfoVar.b.b();
            cogwVar.getClass();
            strF.getClass();
            bxfdVar.g = new bxfi(context, cogwVar, strF, list);
        }
        this.a.countDown();
    }

    @Override // defpackage.bxhc
    public final void b(VCardEntry vCardEntry) throws IOException {
        Uri uriE;
        alqm alqmVarF;
        cqaz.h();
        String displayName = vCardEntry.getDisplayName();
        List<VCardEntry.PhotoData> photoList = vCardEntry.getPhotoList();
        if (photoList == null || photoList.isEmpty()) {
            uriE = null;
        } else {
            Iterator<VCardEntry.PhotoData> it = photoList.iterator();
            uriE = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                byte[] bytes = it.next().getBytes();
                if (bytes != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                    try {
                        Uri uriG = bxlf.g(byteArrayInputStream, this.b.e);
                        if (uriG != null) {
                            uriE = uriG;
                            break;
                        } else {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException unused) {
                            }
                            uriE = uriG;
                        }
                    } finally {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        }
        if (uriE == null) {
            List<VCardEntry.PhoneData> phoneList = vCardEntry.getPhoneList();
            if (phoneList == null || phoneList.isEmpty()) {
                alqmVarF = null;
            } else {
                fcsu fcsuVar = this.b.d;
                alqmVarF = ((alrj) fcsuVar.b()).k(((alrj) fcsuVar.b()).n(phoneList.get(0).getNumber()));
            }
            if (alqmVarF == null) {
                List<VCardEntry.EmailData> emailList = vCardEntry.getEmailList();
                alqmVarF = (emailList == null || emailList.isEmpty()) ? ((alrj) this.b.d.b()).f() : ((alrj) this.b.d.b()).n(emailList.get(0).getAddress());
            }
            uriE = this.b.a.e(null, displayName, alqmVarF, null);
        }
        bxfd bxfdVar = this.b;
        Context context = (Context) bxfdVar.c.a.b();
        context.getClass();
        uriE.getClass();
        bxfdVar.f.add(new bxfm(context, vCardEntry, uriE));
    }

    @Override // defpackage.bxhc
    public final void c() {
    }
}
