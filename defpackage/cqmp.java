package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/file/FileSizeUtils");
    private final crqv b;
    private final cmum c;
    private final Optional d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cqmp(crqv crqvVar, cmum cmumVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = crqvVar;
        this.c = cmumVar;
        this.d = optional;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
    }

    public static int c(dgiq dgiqVar) {
        int i = dgiqVar.o().mMaxSizeFileTransfer;
        if (i == 0) {
            return 104857600;
        }
        return i;
    }

    private final int g() {
        return ((Integer) ((cmlb) this.f.b()).h(cmla.c).map(new Function() { // from class: cqmk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cmmh) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: cqml
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = cmmh.a.d;
                ekrw ekrwVarJ = cqmp.a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getDefaultDataSimSubId", 194, "FileSizeUtils.java")).r("No default data sim subId found, returning a default subId = %s", i);
                return Integer.valueOf(i);
            }
        })).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dggz, java.lang.Object] */
    private final Optional h(int i) {
        Optional optionalK = this.d.get().k(i);
        if (optionalK.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getConfiguration", 168, "FileSizeUtils.java")).r("No RCS configuration found for subId: %s", i);
        }
        return optionalK;
    }

    public final int a(int i, boolean z) {
        return z ? b(i) : this.c.a(i).b();
    }

    public final int b(int i) {
        if (i < 0) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getMaxRcsFileSize", 124, "FileSizeUtils.java")).r("#getMaxRcsFileSize: subId = %s", i);
        }
        return ((Integer) h(i).map(new Function() { // from class: cqmn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(cqmp.c((dgiq) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(104857600)).intValue();
    }

    public final int d(Context context) {
        crqv crqvVar = this.b;
        String string = context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        String string2 = context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String strF = crqvVar.f(string, string2);
        if (string2.equals(strF) && !f()) {
            return -1;
        }
        int iE = e();
        if (!dhhi.b(context) && !string2.equals(strF)) {
            try {
                return Integer.parseInt(strF);
            } catch (NumberFormatException e) {
                cqca.p("Bugle", e, "Unable to parse auto downloadable file size from: ".concat(String.valueOf(strF)));
            }
        }
        return iE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dggz, java.lang.Object] */
    public final int e() {
        int iG = ((aqsw) this.g.b()).a() ? g() : ((crny) this.e.b()).b();
        Optional optionalK = this.d.get().k(iG);
        if (optionalK.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getDefaultDataSimConfiguration", 181, "FileSizeUtils.java")).r("No RCS configuration found for subId: %s", iG);
        }
        return ((Integer) optionalK.map(new Function() { // from class: cqmm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ((dgiq) obj).o().mWarnSizeFileTransfer;
                if (i == 0) {
                    i = 104857600;
                }
                return Integer.valueOf(i);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(104857600)).intValue();
    }

    public final boolean f() {
        return ((Boolean) h(((aqsw) this.g.b()).a() ? g() : ((crny) this.e.b()).b()).map(new Function() { // from class: cqmo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dgiq) obj).o().mFileTransferAutoAcceptSupported);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }
}
