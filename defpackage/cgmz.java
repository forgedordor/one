package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Comparator;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgmz {
    public static final eksp a = eksp.c("BugleNotifications");
    public static final Map b;
    public static final Comparator c;
    public final Context d;
    public final eosc e;
    public final eosc f;
    public final cgqk g;
    public final Optional h;
    public final cldu i;
    public final Map j;
    public final cgoz k;
    public final avmp l;
    public final cgdc m;
    public final cmvw n;
    public final cmuq o;
    public final Optional p;
    public final Optional q;
    public final fcsu r;
    public final fcsu s;
    private final fcsu t;
    private final aypl u;
    private final fcsu v;

    static {
        EnumMap enumMap = new EnumMap(cgit.class);
        b = enumMap;
        enumMap.put((EnumMap) cgit.NAT_COPY_OTP, (cgit) 0);
        enumMap.put((EnumMap) cgit.NAT_MARK_AS_READ, (cgit) 1);
        enumMap.put((EnumMap) cgit.NAT_DOWNLOAD_MMS, (cgit) 2);
        enumMap.put((EnumMap) cgit.NAT_NON_TEXT_SMART_ACTION, (cgit) 3);
        enumMap.put((EnumMap) cgit.NAT_TEXT_CLASSIFIER_ACTION, (cgit) 4);
        enumMap.put((EnumMap) cgit.NAT_QUICK_REPLY, (cgit) 5);
        enumMap.put((EnumMap) cgit.NAT_REMINDER, (cgit) 6);
        enumMap.put((EnumMap) cgit.NAT_WEARABLE_QUICK_REPLY, (cgit) 7);
        enumMap.put((EnumMap) cgit.NAT_WEARABLE_OPEN_CONVERSATION, (cgit) 8);
        enumMap.put((EnumMap) cgit.NAT_WEARABLE_CALL, (cgit) 9);
        c = Comparator.CC.comparing(new Function() { // from class: cgmu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Integer) Map.EL.getOrDefault(cgmz.b, ((cgis) obj).b(), Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.comparingInt(new ToIntFunction() { // from class: cgmv
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                eksp ekspVar = cgmz.a;
                return ((Integer) Objects.requireNonNullElse((Integer) obj, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY))).intValue();
            }
        }));
    }

    public cgmz(Context context, eosc eoscVar, eosc eoscVar2, cgqk cgqkVar, Optional optional, cldu clduVar, fcsu fcsuVar, aypl ayplVar, java.util.Map map, cgoz cgozVar, avmp avmpVar, cgdc cgdcVar, cmvw cmvwVar, cmuq cmuqVar, fcsu fcsuVar2, Optional optional2, Optional optional3, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.d = context;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.g = cgqkVar;
        this.h = optional;
        this.i = clduVar;
        this.t = fcsuVar;
        this.u = ayplVar;
        this.j = map;
        this.k = cgozVar;
        this.l = avmpVar;
        this.m = cgdcVar;
        this.n = cmvwVar;
        this.o = cmuqVar;
        this.v = fcsuVar2;
        this.p = optional3;
        this.q = optional2;
        this.r = fcsuVar3;
        this.s = fcsuVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(boolean z, ekgb ekgbVar) {
        if (!z) {
            return false;
        }
        int size = ekgbVar.size();
        int i = 0;
        while (i < size) {
            int iB = ((baea) ekgbVar.get(i)).b();
            i++;
            if (iB != 2) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return ((ctce) this.v.b()).b() ? 2 : 1;
    }

    public final eiju b(ConversationIdType conversationIdType, cgpe cgpeVar, int i) {
        cglx cglxVar = (cglx) cgpeVar;
        if (!cglxVar.e) {
            ((eksl) a.n().h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createDownloadMmsAction", 682, "IncomingMessageActionCreator.java")).q("Manual download not needed");
            return eijx.e(null);
        }
        MessageIdType messageIdType = cglxVar.f;
        boolean z = i == 1;
        if (messageIdType.c()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createDownloadMmsAction", 689, "IncomingMessageActionCreator.java")).q("Message id is empty, not creating download mms action");
            return eijx.e(null);
        }
        aymn aymnVarA = ((bwwe) this.t.b()).a();
        Context context = this.d;
        return eijx.e(cgis.n(cgit.NAT_DOWNLOAD_MMS, IconCompat.h(context, R.drawable.quantum_gm_ic_file_download_white_24), context.getString(R.string.im_notification_download_mms), aymnVarA.a(context, this.u.b(messageIdType, z), 119, true, bace.c(context, conversationIdType, messageIdType, new String[0])), Optional.empty()).a());
    }
}
