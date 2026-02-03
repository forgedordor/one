package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cslx extends fcyz implements fdat {
    final /* synthetic */ cslz a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslx(cslz cslzVar, Uri uri, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cslzVar;
        this.b = uri;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cslz cslzVar = this.a;
        Context context = cslzVar.b;
        Uri uri = this.b;
        AssetFileDescriptor assetFileDescriptorA = ebsv.a(context, uri, "r", cslzVar.e(uri));
        String str = this.c;
        try {
            assetFileDescriptorA.getClass();
            eieu eieuVarH = eiiy.h("HaasProxyImpl.computeHash");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.getClass();
                messageDigest.reset();
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorA.createInputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStreamCreateInputStream.read(bArr);
                        if (i <= 0) {
                            fczl.a(fileInputStreamCreateInputStream, null);
                            byte[] bArrDigest = messageDigest.digest();
                            bArrDigest.getClass();
                            String strU = fcur.U(bArrDigest, new fdap() { // from class: cslk
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    Byte b = (Byte) obj2;
                                    b.byteValue();
                                    String str2 = String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
                                    str2.getClass();
                                    return str2;
                                }
                            });
                            fczl.a(eieuVarH, null);
                            Boolean boolValueOf = Boolean.valueOf(fdbq.f(strU, str));
                            fczl.a(assetFileDescriptorA, null);
                            return boolValueOf;
                        }
                        messageDigest.update(bArr, 0, i);
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cslx(this.a, this.b, this.c, fcxyVar);
    }
}
