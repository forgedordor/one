package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import j$.nio.channels.DesugarChannels;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mil extends mhf {
    private final Context a;
    private mht b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public mil(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse(a.g(i, "rawresource:///"));
    }

    private static int k(String str) throws mik {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new mik("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor l(Context context, mht mhtVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, mik {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = mhtVar.a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new mik("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = k(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new mik("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            mee.f(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new mik("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = k(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(a.q(path, packageName, ":"), "raw", null);
                if (identifier == 0) {
                    throw new mik("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new mik("Resource is compressed: ".concat(String.valueOf(String.valueOf(uriNormalizeScheme))), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new mik(null, e2, 2005);
        }
    }

    @Override // defpackage.mah
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new mik(null, e, 2000);
            }
        }
        InputStream inputStream = this.d;
        String str = mgb.a;
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.e == -1) {
                return -1;
            }
            throw new mik("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - i3;
        }
        g(i3);
        return i3;
    }

    @Override // defpackage.mhl
    public final long b(mht mhtVar) throws mhp, Resources.NotFoundException, PackageManager.NameNotFoundException {
        this.b = mhtVar;
        j();
        AssetFileDescriptor assetFileDescriptorL = l(this.a, mhtVar);
        this.c = assetFileDescriptorL;
        long length = assetFileDescriptorL.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.c.getFileDescriptor());
        this.d = fileInputStream;
        if (length != -1) {
            try {
                if (mhtVar.e > length) {
                    throw new mik(null, null, 2008);
                }
            } catch (mik e) {
                throw e;
            } catch (IOException e2) {
                throw new mik(null, e2, 2000);
            }
        }
        long startOffset = this.c.getStartOffset();
        long j = mhtVar.e;
        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
        if (jSkip != j) {
            throw new mik(null, null, 2008);
        }
        if (length == -1) {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                this.e = -1L;
            } else {
                long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                this.e = size;
                if (size < 0) {
                    throw new mik(null, null, 2008);
                }
            }
        } else {
            long j2 = length - jSkip;
            this.e = j2;
            if (j2 < 0) {
                throw new mhp(2008);
            }
        }
        long j3 = mhtVar.f;
        this.f = true;
        i(mhtVar);
        return this.e;
    }

    @Override // defpackage.mhl
    public final Uri c() {
        mht mhtVar = this.b;
        if (mhtVar != null) {
            return mhtVar.a;
        }
        return null;
    }

    @Override // defpackage.mhl
    public final void d() {
        this.b = null;
        try {
            try {
                try {
                    InputStream inputStream = this.d;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.d = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            h();
                        }
                    } catch (IOException e) {
                        throw new mik(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new mik(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th2;
            } catch (IOException e3) {
                throw new mik(null, e3, 2000);
            }
        }
    }
}
