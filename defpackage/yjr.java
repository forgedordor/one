package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjr {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache");
    public final ykc b;
    public final fcyh c;
    public final yjp d;
    public HashSet e;
    public HashSet f;
    private final fdjx g;

    public yjr(ykc ykcVar, fdjx fdjxVar, fcyh fcyhVar, Optional optional) {
        ykcVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.b = ykcVar;
        this.g = fdjxVar;
        this.c = fdjxVar.hE();
        yjs yjsVar = (yjs) fdct.b(optional);
        this.d = new yjp(yjsVar != null ? yjsVar.a.b() : BasePaymentResult.ERROR_REQUEST_FAILED, new yjq(this));
        this.e = new HashSet();
        this.f = new HashSet();
    }
}
