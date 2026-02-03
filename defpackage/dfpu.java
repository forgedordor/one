package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpu implements dstu, dgin {
    public final Context a;
    public final dexn b;
    public final dhdy c;
    final dfhz d;
    private final Map e = new HashMap();
    private final dgyu f;
    private final dhgr g;
    private final dhgz h;
    private final dfpv i;

    public dfpu(Context context, dgyu dgyuVar, dhgr dhgrVar, dexn dexnVar, dhgz dhgzVar, dhdy dhdyVar, dfpv dfpvVar) {
        this.a = context;
        this.f = dgyuVar;
        this.g = dhgrVar;
        this.b = dexnVar;
        this.h = dhgzVar;
        this.c = dhdyVar;
        this.i = dfpvVar;
        dfhz dfhzVar = new dfhz() { // from class: dfpt
            /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[Catch: IOException -> 0x01a4, TryCatch #1 {IOException -> 0x01a4, blocks: (B:24:0x00a9, B:27:0x00b6, B:28:0x00bc, B:30:0x00cb, B:32:0x00cf, B:33:0x00d1, B:35:0x00dc, B:38:0x00e3, B:39:0x00e7, B:41:0x00ed, B:45:0x00fd, B:47:0x0101, B:49:0x010d, B:51:0x017e, B:52:0x0183, B:54:0x018b, B:56:0x0191, B:57:0x019c), top: B:68:0x00a9 }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00dc A[Catch: IOException -> 0x01a4, TryCatch #1 {IOException -> 0x01a4, blocks: (B:24:0x00a9, B:27:0x00b6, B:28:0x00bc, B:30:0x00cb, B:32:0x00cf, B:33:0x00d1, B:35:0x00dc, B:38:0x00e3, B:39:0x00e7, B:41:0x00ed, B:45:0x00fd, B:47:0x0101, B:49:0x010d, B:51:0x017e, B:52:0x0183, B:54:0x018b, B:56:0x0191, B:57:0x019c), top: B:68:0x00a9 }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0101 A[Catch: IOException -> 0x01a4, TryCatch #1 {IOException -> 0x01a4, blocks: (B:24:0x00a9, B:27:0x00b6, B:28:0x00bc, B:30:0x00cb, B:32:0x00cf, B:33:0x00d1, B:35:0x00dc, B:38:0x00e3, B:39:0x00e7, B:41:0x00ed, B:45:0x00fd, B:47:0x0101, B:49:0x010d, B:51:0x017e, B:52:0x0183, B:54:0x018b, B:56:0x0191, B:57:0x019c), top: B:68:0x00a9 }] */
            @Override // defpackage.dfhz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.dgyx r18, long r19, java.lang.String r21) throws org.xmlpull.v1.XmlPullParserException {
                /*
                    Method dump skipped, instructions count: 435
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dfpt.a(dgyx, long, java.lang.String):void");
            }
        };
        this.d = dfhzVar;
        dexnVar.w("application/vnd.gsma.rcspushlocation+xml", dfhzVar);
    }

    @Override // defpackage.dstu
    public final LocationSharingResult a(long j, String str, LocationInformation locationInformation, String str2) {
        String str3;
        String strB;
        dhja.c("Pushing location via chat, request ID = %d", Long.valueOf(j));
        try {
            strB = TextUtils.isEmpty(str2) ? dhil.b() : str2;
        } catch (IOException e) {
            e = e;
            str3 = str2;
        }
        try {
            return new LocationSharingResult(j, str, this.b.e(str, b(locationInformation), "application/vnd.gsma.rcspushlocation+xml", strB).getCode(), null, strB);
        } catch (IOException e2) {
            e = e2;
            str3 = strB;
            dhja.i(e, "Error while pushing location information", new Object[0]);
            return new LocationSharingResult(j, str, 1, null, str3);
        }
    }

    final byte[] b(LocationInformation locationInformation) {
        return this.i.a(this.f.a(), locationInformation);
    }

    @Override // defpackage.dstu
    public final long[] c() {
        return dhic.b(this.e.keySet());
    }

    @Override // defpackage.dstu
    public final LocationSharingResult[] d(long j, LocationInformation locationInformation, String str) {
        dhja.c("Push location to group via chat, session ID = %d", Long.valueOf(j));
        if (this.g.a(j).isEmpty()) {
            return dfhq.j(9, "Session does not exist or is not a group chat session");
        }
        try {
            String strB = TextUtils.isEmpty(str) ? dhil.b() : str;
            return new LocationSharingResult[]{new LocationSharingResult(this.h.c(), " ", this.b.d(j, strB, "application/vnd.gsma.rcspushlocation+xml", b(locationInformation)).getCode(), null, strB)};
        } catch (IOException e) {
            dhja.i(e, "Error while pushing location information", new Object[0]);
            return dfhq.j(1, e.getMessage());
        }
    }

    @Override // defpackage.dgin
    public final /* synthetic */ void u(dgiq dgiqVar) {
    }
}
