package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqp implements Parcelable {
    public static final Parcelable.Creator<ecqp> CREATOR = new ecqo();
    public exoz a;
    public String b;
    public expy c;
    public long d;
    public boolean e;
    public String f;
    public int g;

    public ecqp() {
        this.a = exoz.a;
        this.g = 1;
        this.b = "";
        this.c = expy.a;
        this.d = 0L;
        this.e = false;
        this.f = "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeByteArray(this.a.toByteArray());
        int i2 = this.g;
        switch (i2) {
            case 1:
                str = "NOT_SET";
                break;
            case 2:
                str = "SURVEY_SHOWN";
                break;
            case 3:
                str = "SURVEY_ACCEPTED";
                break;
            case 4:
                str = "INVITATION_ANSWERED";
                break;
            case 5:
                str = "QUESTION_ANSWERED";
                break;
            case 6:
                str = "SURVEY_CLOSED";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 == 0) {
            throw null;
        }
        parcel.writeString(str);
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c.toByteArray());
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ecqp(android.os.Parcel r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecqp.<init>(android.os.Parcel):void");
    }
}
