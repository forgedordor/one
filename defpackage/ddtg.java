package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.IMobStoreFileService;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtg implements echo {
    public final ejxr a;
    private final ecgd b;

    public ddtg(Context context) {
        ecgd ecgdVar = new ecgd();
        Context applicationContext = context.getApplicationContext();
        int i = ddti.b;
        this.a = new ejxw(new ddtq(applicationContext));
        this.b = ecgdVar;
    }

    private final ParcelFileDescriptor p(final Uri uri, final int i) {
        return (ParcelFileDescriptor) q("open file", new Callable() { // from class: ddtc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ddtq ddtqVar = (ddtq) ((ejxw) this.a.a).a;
                Uri uri2 = uri;
                int i2 = i;
                final OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri2, i2);
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: ddtl
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        ddtu ddtuVar = (ddtu) obj;
                        defr defrVar = (defr) obj2;
                        ddtm ddtmVar = new ddtm(defrVar);
                        OpenFileDescriptorRequest openFileDescriptorRequest2 = openFileDescriptorRequest;
                        try {
                            IMobStoreFileService iMobStoreFileService = (IMobStoreFileService) ddtuVar.w();
                            Context context = ddtuVar.c;
                            iMobStoreFileService.openFileDescriptor(ddtmVar, openFileDescriptorRequest2, ddlh.a());
                        } catch (RemoteException unused) {
                            dcjb.b(Status.c, null, defrVar);
                        }
                    }
                };
                dcizVar.b = i2 == 1 ? new Feature[]{dddr.c} : null;
                dcizVar.c = 7801;
                return ((OpenFileDescriptorResponse) degc.f(ddtqVar.j(dcizVar.a()))).a;
            }
        });
    }

    private static final Object q(String str, Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof dcff) {
                dcff dcffVar = (dcff) cause;
                String str2 = dcffVar.a.h;
                if (dcffVar.a() == 33500) {
                    throw new FileNotFoundException(a.n(str2, str, "Unable to ", " because "));
                }
                if (dcffVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException(a.n(str2, str, "Unable to ", " because "));
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.echo
    public final /* synthetic */ long a(Uri uri) {
        return echn.e(this);
    }

    @Override // defpackage.echo
    public final Pair b(Uri uri) {
        return ecfj.a(p(uri, 0));
    }

    @Override // defpackage.echo
    public final ecgd c() {
        return this.b;
    }

    @Override // defpackage.echo
    public final /* synthetic */ File d(Uri uri) {
        return echn.a(this, uri);
    }

    @Override // defpackage.echo
    public final InputStream e(Uri uri) {
        return new ddte(p(uri, 0));
    }

    @Override // defpackage.echo
    public final /* synthetic */ OutputStream f(Uri uri) {
        return echn.f(this);
    }

    @Override // defpackage.echo
    public final OutputStream g(Uri uri) {
        return new ddtf(p(uri, 1));
    }

    @Override // defpackage.echo
    public final /* synthetic */ Iterable h(Uri uri) {
        return echn.b(this);
    }

    @Override // defpackage.echo
    public final String i() {
        return "android";
    }

    @Override // defpackage.echo
    public final /* synthetic */ void j(Uri uri) throws ecgh {
        echn.c(this);
    }

    @Override // defpackage.echo
    public final /* synthetic */ void k(Uri uri) throws ecgh {
        echn.d(this);
    }

    @Override // defpackage.echo
    public final void l(final Uri uri) throws IOException {
        q("delete file", new Callable() { // from class: ddtd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ddtq ddtqVar = (ddtq) ((ejxw) this.a.a).a;
                final DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri);
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: ddtk
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        ddtu ddtuVar = (ddtu) obj;
                        defr defrVar = (defr) obj2;
                        ddtn ddtnVar = new ddtn(defrVar);
                        DeleteFileRequest deleteFileRequest2 = deleteFileRequest;
                        try {
                            IMobStoreFileService iMobStoreFileService = (IMobStoreFileService) ddtuVar.w();
                            Context context = ddtuVar.c;
                            iMobStoreFileService.deleteFile(ddtnVar, deleteFileRequest2, ddlh.a());
                        } catch (RemoteException unused) {
                            dcjb.b(Status.c, null, defrVar);
                        }
                    }
                };
                dcizVar.b = new Feature[]{dddr.c};
                dcizVar.c = 7802;
                return (Void) degc.f(ddtqVar.j(dcizVar.a()));
            }
        });
    }

    @Override // defpackage.echo
    public final void m(final Uri uri, final Uri uri2) throws IOException {
        q("rename file", new Callable() { // from class: ddtb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ddtq ddtqVar = (ddtq) ((ejxw) this.a.a).a;
                final RenameRequest renameRequest = new RenameRequest(uri, uri2);
                dciz dcizVar = new dciz();
                dcizVar.a = new dcir() { // from class: ddtj
                    @Override // defpackage.dcir
                    public final void a(Object obj, Object obj2) {
                        ddtu ddtuVar = (ddtu) obj;
                        defr defrVar = (defr) obj2;
                        ddto ddtoVar = new ddto(defrVar);
                        RenameRequest renameRequest2 = renameRequest;
                        try {
                            IMobStoreFileService iMobStoreFileService = (IMobStoreFileService) ddtuVar.w();
                            Context context = ddtuVar.c;
                            iMobStoreFileService.rename(ddtoVar, renameRequest2, ddlh.a());
                        } catch (RemoteException unused) {
                            dcjb.b(Status.c, null, defrVar);
                        }
                    }
                };
                dcizVar.b = new Feature[]{dddr.d};
                dcizVar.b();
                dcizVar.c = 7803;
                return (Void) degc.f(ddtqVar.j(dcizVar.a()));
            }
        });
    }

    @Override // defpackage.echo
    public final boolean n(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorP = p(uri, 0);
            if (parcelFileDescriptorP == null) {
                return true;
            }
            parcelFileDescriptorP.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.echo
    public final /* synthetic */ boolean o(Uri uri) throws ecgh {
        throw new ecgh("isDirectory not supported by android");
    }
}
