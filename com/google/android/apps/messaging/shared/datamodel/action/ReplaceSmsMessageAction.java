package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.aipo;
import defpackage.ajhd;
import defpackage.aycg;
import defpackage.ayej;
import defpackage.ayqg;
import defpackage.bbdl;
import defpackage.bbfn;
import defpackage.bveg;
import defpackage.cmot;
import defpackage.cqce;
import defpackage.crtq;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReplaceSmsMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final ajhd A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final aycg H;
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final bbfn d;
    public final bveg e;
    public final dqsn f;
    public final fcsu g;
    public final fcsu h;
    private final Context k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final crtq p;
    private final aipo q;
    private final cmot r;
    private final bbdl s;
    private static final ekrg i = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ReplaceSmsMessageAction");
    private static final cqce j = cqce.g("BugleDataModel", "ReplaceSmsMessageAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new ayej();

    /* compiled from: PG */
    public interface a {
        ayqg bo();
    }

    public ReplaceSmsMessageAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, crtq crtqVar, aipo aipoVar, cmot cmotVar, bbdl bbdlVar, ajhd ajhdVar, bbfn bbfnVar, aycg aycgVar, bveg bvegVar, dqsn dqsnVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, Parcel parcel) {
        super(parcel, elgm.REPLACE_SMS_MESSAGE_ACTION);
        this.k = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
        this.o = fcsuVar7;
        this.p = crtqVar;
        this.q = aipoVar;
        this.r = cmotVar;
        this.s = bbdlVar;
        this.A = ajhdVar;
        this.d = bbfnVar;
        this.H = aycgVar;
        this.e = bvegVar;
        this.f = dqsnVar;
        this.B = fcsuVar8;
        this.C = fcsuVar9;
        this.g = fcsuVar10;
        this.D = fcsuVar11;
        this.h = fcsuVar12;
        this.E = fcsuVar13;
        this.F = fcsuVar14;
        this.G = fcsuVar15;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReplaceSmsMessageAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0368 A[Catch: all -> 0x03dc, TRY_ENTER, TryCatch #3 {all -> 0x03dc, blocks: (B:3:0x000f, B:7:0x0036, B:9:0x0043, B:10:0x0048, B:12:0x005f, B:13:0x006d, B:15:0x008d, B:16:0x0090, B:24:0x00dc, B:30:0x00e8, B:31:0x00f5, B:33:0x00fb, B:34:0x0100, B:38:0x0129, B:40:0x0152, B:42:0x01b2, B:44:0x01b8, B:46:0x01c4, B:47:0x01cc, B:49:0x01d6, B:51:0x01f4, B:53:0x01fa, B:62:0x020c, B:68:0x021a, B:70:0x0223, B:72:0x022a, B:74:0x0233, B:78:0x0251, B:80:0x026b, B:82:0x0272, B:88:0x0297, B:91:0x02fc, B:98:0x033f, B:101:0x0368, B:112:0x03cb, B:102:0x039b, B:110:0x03c2, B:109:0x03bf, B:77:0x024d, B:73:0x022f, B:69:0x021f, B:111:0x03c3, B:41:0x017d, B:37:0x0125, B:26:0x00e1, B:27:0x00e4, B:6:0x0032, B:19:0x00be, B:21:0x00c4, B:89:0x02f6, B:93:0x0300, B:95:0x030f, B:96:0x0327, B:106:0x03ba), top: B:127:0x000f, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x039b A[Catch: all -> 0x03dc, TRY_LEAVE, TryCatch #3 {all -> 0x03dc, blocks: (B:3:0x000f, B:7:0x0036, B:9:0x0043, B:10:0x0048, B:12:0x005f, B:13:0x006d, B:15:0x008d, B:16:0x0090, B:24:0x00dc, B:30:0x00e8, B:31:0x00f5, B:33:0x00fb, B:34:0x0100, B:38:0x0129, B:40:0x0152, B:42:0x01b2, B:44:0x01b8, B:46:0x01c4, B:47:0x01cc, B:49:0x01d6, B:51:0x01f4, B:53:0x01fa, B:62:0x020c, B:68:0x021a, B:70:0x0223, B:72:0x022a, B:74:0x0233, B:78:0x0251, B:80:0x026b, B:82:0x0272, B:88:0x0297, B:91:0x02fc, B:98:0x033f, B:101:0x0368, B:112:0x03cb, B:102:0x039b, B:110:0x03c2, B:109:0x03bf, B:77:0x024d, B:73:0x022f, B:69:0x021f, B:111:0x03c3, B:41:0x017d, B:37:0x0125, B:26:0x00e1, B:27:0x00e4, B:6:0x0032, B:19:0x00be, B:21:0x00c4, B:89:0x02f6, B:93:0x0300, B:95:0x030f, B:96:0x0327, B:106:0x03ba), top: B:127:0x000f, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0300 A[Catch: all -> 0x03b8, TRY_ENTER, TryCatch #2 {all -> 0x03b8, blocks: (B:89:0x02f6, B:93:0x0300, B:95:0x030f, B:96:0x0327), top: B:126:0x02f6, outer: #3 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReplaceSmsMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C(parcel, i2);
    }

    public ReplaceSmsMessageAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, crtq crtqVar, aipo aipoVar, cmot cmotVar, bbdl bbdlVar, ajhd ajhdVar, bbfn bbfnVar, aycg aycgVar, bveg bvegVar, dqsn dqsnVar, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, String str, ContentValues contentValues, long j2) {
        super(elgm.REPLACE_SMS_MESSAGE_ACTION);
        this.k = context;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
        this.o = fcsuVar7;
        this.p = crtqVar;
        this.q = aipoVar;
        this.r = cmotVar;
        this.s = bbdlVar;
        this.A = ajhdVar;
        this.d = bbfnVar;
        this.H = aycgVar;
        this.e = bvegVar;
        this.f = dqsnVar;
        this.B = fcsuVar8;
        this.C = fcsuVar9;
        this.g = fcsuVar10;
        this.D = fcsuVar11;
        this.h = fcsuVar12;
        this.E = fcsuVar13;
        this.F = fcsuVar14;
        this.G = fcsuVar15;
        this.v.t("message_values", contentValues);
        this.v.v("originating_address", str);
        this.v.s("message_logging_id", j2);
    }
}
