package defpackage;

import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwv extends fcyz implements fdat {
    final /* synthetic */ ahwx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwv(ahwx ahwxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ahwx ahwxVar = this.a;
        if (!((arji) ahwxVar.b.b()).a()) {
            return new ArrayList();
        }
        File[] fileArrListFiles = ahwxVar.a.getDir("logs", 0).listFiles(new FilenameFilter() { // from class: ahwp
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                str.getClass();
                return fdgn.t(str, "bugle_restore_logs.txt");
            }
        });
        fcww fcwwVar = new fcww((byte[]) null);
        if (fileArrListFiles != null) {
            Iterator itA = fdbd.a(fileArrListFiles);
            while (itA.hasNext()) {
                File file = (File) itA.next();
                file.getClass();
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    long length = file.length();
                    if (length > 2147483647L) {
                        throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                    }
                    int i = (int) length;
                    byte[] bArrCopyOf = new byte[i];
                    int i2 = 0;
                    int i3 = i;
                    while (i3 > 0) {
                        int i4 = fileInputStream.read(bArrCopyOf, i2, i3);
                        if (i4 < 0) {
                            break;
                        }
                        i3 -= i4;
                        i2 += i4;
                    }
                    if (i3 > 0) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                        bArrCopyOf.getClass();
                    } else {
                        int i5 = fileInputStream.read();
                        if (i5 != -1) {
                            fczm fczmVar = new fczm();
                            fczmVar.write(i5);
                            fczk.b(fileInputStream, fczmVar);
                            int size = fczmVar.size() + i;
                            if (size < 0) {
                                throw new OutOfMemoryError(a.h(file, "File ", " is too big to fit in memory."));
                            }
                            byte[] bArrA = fczmVar.a();
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                            bArrCopyOf.getClass();
                            fcur.i(bArrA, bArrCopyOf, i, 0, fczmVar.size());
                        }
                    }
                    fczl.a(fileInputStream, null);
                    fcwwVar.add(new FileTeleporter(bArrCopyOf, file.getName()));
                } finally {
                }
            }
        }
        return fcva.aq(fcva.a(fcwwVar));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwv(this.a, fcxyVar);
    }
}
