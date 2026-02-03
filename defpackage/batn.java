package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class batn {
    public static final cqce a = cqce.g("Bugle", "IntentConverter");
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter");
    public final cqmr b;
    public final Context c;
    public final ains d;
    public final baii e;
    private final fcsu g;
    private final cqmz h;

    public batn(cqmr cqmrVar, Context context, fcsu fcsuVar, cqmz cqmzVar, ains ainsVar, baii baiiVar) {
        this.b = cqmrVar;
        this.c = context;
        this.g = fcsuVar;
        this.h = cqmzVar;
        this.d = ainsVar;
        this.e = baiiVar;
    }

    public final IncomingDraft a(Intent intent) {
        try {
            return b(intent);
        } catch (batm unused) {
            return null;
        }
    }

    public final IncomingDraft b(Intent intent) throws IOException {
        final ArrayList arrayList;
        String str;
        ekrg ekrgVar = f;
        ekrw ekrwVarE = ekrgVar.e();
        ekrwVarE.X(eksq.a, "IntentConverter");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.Z(eksk.SMALL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter", "convertIncomingDraftThrowInvalid", 183, "IntentConverter.java")).t("Converting intent to IncomingDraft %s", intent);
        String str2 = null;
        String str3 = (String) cqti.a(intent).orElse(null);
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("extra_subject_mandatory", false);
        String action = intent.getAction();
        boolean z2 = true;
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SENDTO".equals(action) || "android.intent.action.VIEW".equals(action)) {
            arrayList = new ArrayList(1);
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null) {
                arrayList.add(uri);
            }
        } else {
            if (!"android.intent.action.SEND_MULTIPLE".equals(action)) {
                ekrw ekrwVarJ = ekrgVar.j();
                ekrwVarJ.X(eksq.a, "IntentConverter");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter", "convertIncomingDraftThrowInvalid", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "IntentConverter.java")).t("Unsupported action type for sharing: %s", action);
                throw new batm("Unsupported action type for sharing: ".concat(String.valueOf(action)));
            }
            arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            try {
                String type = intent.getType();
                arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    boolean z3 = z;
                    Uri uriB = (Uri) arrayList.get(i);
                    boolean z4 = z2;
                    String strC = c(uriB, type);
                    cqce cqceVar = a;
                    String str4 = type;
                    String str5 = stringExtra;
                    int i2 = size;
                    Object[] objArr = new Object[3];
                    objArr[z3 ? 1 : 0] = uriB;
                    objArr[z4 ? 1 : 0] = str4;
                    objArr[2] = strC;
                    cqceVar.m(String.format("createAttachmentsFromUris: uri=%s, defaultType=%s, finalType=%s", objArr));
                    if (uriB == null) {
                        str = null;
                    } else {
                        if (cqmz.o(uriB)) {
                            uriB = this.b.b(uriB);
                        }
                        cqmr cqmrVar = this.b;
                        Context context = this.c;
                        uriB.getClass();
                        if (cqmrVar.g(context, uriB)) {
                            if (cqmz.s(uriB)) {
                                this.d.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
                            } else {
                                this.d.c("Bugle.Share.InternalDataFile.AttachAborted");
                            }
                            throw new IllegalArgumentException("Cannot send private app data");
                        }
                        if (strC == null || !le.p(strC)) {
                            str = null;
                            Object[] objArr2 = new Object[3];
                            objArr2[z3 ? 1 : 0] = uriB;
                            objArr2[z4 ? 1 : 0] = str4;
                            objArr2[2] = strC;
                            cqceVar.n(String.format("Unsupported content type: uri=%s, defaultType=%s, finalType=%s", objArr2));
                        } else {
                            str = null;
                            arrayList2.add(new IncomingDraft.Attachment(strC, uriB, null));
                        }
                    }
                    i++;
                    type = str4;
                    str2 = str;
                    z2 = z4 ? 1 : 0;
                    z = z3 ? 1 : 0;
                    stringExtra = str5;
                    size = i2;
                }
            } catch (IllegalArgumentException e) {
                ekrw ekrwVarJ2 = f.j();
                ekrwVarJ2.X(eksq.a, "IntentConverter");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/datamodel/data/draft/IntentConverter", "convertIncomingDraftThrowInvalid", 211, "IntentConverter.java")).t("Failed to create an attachment for %s", new ekri() { // from class: batk
                    @Override // defpackage.ekri
                    public final Object a() {
                        Stream map = Collection.EL.stream(arrayList).map(new Function() { // from class: batl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return cqcv.f((Uri) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i3 = ekgb.d;
                        return (ekgb) map.collect(ekcv.a);
                    }
                });
                throw new batm(e);
            }
        }
        return avnz.a(str3, arrayList2, z2 != booleanExtra ? str2 : stringExtra);
    }

    public final String c(Uri uri, String str) {
        if (le.w(str)) {
            return le.b(str);
        }
        if (uri == null || !this.h.l(str)) {
            return str;
        }
        String type = this.c.getContentResolver().getType(uri);
        if (type != null) {
            return type;
        }
        cqwg cqwgVar = (cqwg) this.g.b();
        try {
            try {
                cqwgVar.c(uri);
                String strE = cqwgVar.e();
                if (strE != null) {
                    return strE;
                }
            } catch (IOException e) {
                cqca.k("Bugle", e, a.J(uri, "Could not determine type of "));
            }
            return str;
        } finally {
            cqwgVar.b();
        }
    }
}
