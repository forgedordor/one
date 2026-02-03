package defpackage;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.content.Context;
import android.net.Uri;
import android.os.LimitExceededException;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecff implements echo {
    private final BlobStoreManager a;

    public ecff(Context context) {
        this.a = aee$$ExternalSyntheticApiModelOutline0.m52m(context.getSystemService("blob_store"));
    }

    private final ParcelFileDescriptor p(Uri uri) throws ecge {
        ecfh.a(uri);
        return this.a.openBlob(BlobHandle.createWithSha256(ecfh.d(uri.getPath()), "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"));
    }

    private final void q(byte[] bArr) throws IOException {
        try {
            this.a.releaseLease(BlobHandle.createWithSha256(bArr, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"));
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            throw new IOException("Failed to release the lease", e);
        }
    }

    @Override // defpackage.echo
    public final /* synthetic */ long a(Uri uri) {
        return echn.e(this);
    }

    @Override // defpackage.echo
    public final Pair b(Uri uri) {
        return ecfj.a(p(uri));
    }

    @Override // defpackage.echo
    public final /* synthetic */ ecgd c() throws ecgh {
        throw new ecgh("lockScope not supported by blobstore");
    }

    @Override // defpackage.echo
    public final /* synthetic */ File d(Uri uri) {
        return echn.a(this, uri);
    }

    @Override // defpackage.echo
    public final InputStream e(Uri uri) {
        return new ParcelFileDescriptor.AutoCloseInputStream(p(uri));
    }

    @Override // defpackage.echo
    public final /* synthetic */ OutputStream f(Uri uri) {
        return echn.f(this);
    }

    @Override // defpackage.echo
    public final OutputStream g(Uri uri) throws IOException {
        ecfh.a(uri);
        byte[] bArrD = ecfh.d(uri.getPath());
        try {
            if (!ecfh.c(uri.getPath())) {
                BlobHandle blobHandleCreateWithSha256 = BlobHandle.createWithSha256(bArrD, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
                BlobStoreManager blobStoreManager = this.a;
                BlobStoreManager.Session sessionOpenSession = blobStoreManager.openSession(blobStoreManager.createSession(blobHandleCreateWithSha256));
                sessionOpenSession.allowPublicAccess();
                return new ecfe(sessionOpenSession.openWrite(0L, -1L), sessionOpenSession);
            }
            BlobStoreManager blobStoreManager2 = this.a;
            if (blobStoreManager2.getRemainingLeaseQuotaBytes() <= 0) {
                throw new ecfy((byte[]) null);
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String query = uri.getQuery();
            if (TextUtils.isEmpty(query)) {
                throw new ecge(String.format("The uri query is null or empty, expected %s", "expiryDateSecs=<expiryDateSecs>"));
            }
            String queryParameter = uri.getQueryParameter("expiryDateSecs");
            if (queryParameter == null) {
                throw new ecge(String.format("The uri query is malformed, expected %s but found %s", "expiryDateSecs=<expiryDateSecs>", query));
            }
            blobStoreManager2.acquireLease(BlobHandle.createWithSha256(bArrD, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"), "String description needed for providing a better user experience", timeUnit.toMillis(Long.parseLong(queryParameter)));
            return null;
        } catch (LimitExceededException e) {
            throw new ecfy(e);
        } catch (IllegalStateException e2) {
            throw new IOException("Failed to write into BlobStoreManager", e2);
        }
    }

    @Override // defpackage.echo
    public final /* synthetic */ Iterable h(Uri uri) {
        return echn.b(this);
    }

    @Override // defpackage.echo
    public final String i() {
        return "blobstore";
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
    public final void l(Uri uri) throws IOException {
        ecfh.a(uri);
        if (!ecfh.b(uri.getPath())) {
            q(ecfh.d(uri.getPath()));
            return;
        }
        Iterator it = this.a.getLeasedBlobs().iterator();
        while (it.hasNext()) {
            q(aee$$ExternalSyntheticApiModelOutline0.m51m(it.next()).getSha256Digest());
        }
    }

    @Override // defpackage.echo
    public final /* synthetic */ void m(Uri uri, Uri uri2) throws ecgh {
        throw new ecgh("rename not supported by blobstore");
    }

    @Override // defpackage.echo
    public final boolean n(Uri uri) throws IOException {
        boolean z = false;
        try {
            ParcelFileDescriptor parcelFileDescriptorP = p(uri);
            if (parcelFileDescriptorP != null) {
                try {
                    if (parcelFileDescriptorP.getFileDescriptor().valid()) {
                        z = true;
                    }
                } finally {
                }
            }
            if (parcelFileDescriptorP != null) {
                parcelFileDescriptorP.close();
            }
        } catch (SecurityException unused) {
        }
        return z;
    }

    @Override // defpackage.echo
    public final boolean o(Uri uri) {
        return false;
    }
}
