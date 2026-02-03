package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szd {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/backup/BackupAttachmentsOperations");
    public final aysi a;
    public final ahzu b;
    private final Context d;
    private final String e;

    public szd(Context context, aysi aysiVar, ahzv ahzvVar) {
        context.getClass();
        aysiVar.getClass();
        this.d = context;
        this.a = aysiVar;
        this.b = ahzvVar.a(c, null, null);
        this.e = "com.android.providers.telephony";
    }

    public static final boolean c(Long l) {
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("queryMinAttachmentId");
        bsjeVarC.h(new Function() { // from class: szc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.getClass();
                bsjlVar.x();
                bsjlVar.z(Uri.parse(""));
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return l != null && l.longValue() == bsjeVarC.b().k(PartsTable.d.a);
    }

    public final ParcelFileDescriptor a(Uri uri, String str, ebsu ebsuVar) throws tby {
        try {
            ParcelFileDescriptor parcelFileDescriptor = ebsv.a(this.d, uri, "r", ebsuVar).getParcelFileDescriptor();
            parcelFileDescriptor.getClass();
            return parcelFileDescriptor;
        } catch (FileNotFoundException e) {
            ahzu ahzuVar = this.b;
            ekrz ekrzVar = cqnc.v;
            ekrzVar.getClass();
            ekrz ekrzVar2 = cqnc.ab;
            ekrzVar2.getClass();
            ahzuVar.p(e, ekrzVar, str, ekrzVar2, uri, "File not found when opening uri file descriptor");
            throw new tby("File not found when opening uri file descriptor", e);
        }
    }

    public final ebsu b(Uri uri) {
        String authority = uri.getAuthority();
        if (authority != null && fdgn.t(authority, "mms")) {
            return ebsu.a(this.e);
        }
        ebsu ebsuVar = ebsu.c;
        ebsuVar.getClass();
        return ebsuVar;
    }
}
