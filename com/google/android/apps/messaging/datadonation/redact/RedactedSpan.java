package com.google.android.apps.messaging.datadonation.redact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import defpackage.aasm;
import defpackage.aasn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RedactedSpan implements Parcelable {
    public static final Parcelable.Creator<RedactedSpan> CREATOR = new aasm();
    public final aasn a;

    public RedactedSpan(aasn aasnVar) {
        this.a = aasnVar;
    }

    public static SpannableStringBuilder a(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int i = parcel.readInt();
        while (i != -1) {
            spannableStringBuilder.setSpan(new RedactedSpan(aasn.a(i)), parcel.readInt(), parcel.readInt(), 17);
            i = parcel.readInt();
        }
        return spannableStringBuilder;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, aasn aasnVar, String str) {
        int i;
        SpannableString spannableString = new SpannableString(spannableStringBuilder);
        if (aasnVar == aasn.EMAIL) {
            i = 2;
        } else {
            if (aasnVar != aasn.URL) {
                throw new IllegalArgumentException();
            }
            i = 1;
        }
        Linkify.addLinks(spannableString, i);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            URLSpan uRLSpan = uRLSpanArr[length];
            int spanStart = spannableString.getSpanStart(uRLSpan);
            spannableStringBuilder.replace(spanStart, spannableString.getSpanEnd(uRLSpan), (CharSequence) str);
            spannableStringBuilder.setSpan(new RedactedSpan(aasnVar), spanStart, str.length() + spanStart, 17);
        }
    }

    public static void c(Parcel parcel, Spanned spanned) {
        parcel.writeString(spanned.toString());
        for (RedactedSpan redactedSpan : (RedactedSpan[]) spanned.getSpans(0, spanned.length(), RedactedSpan.class)) {
            parcel.writeInt(redactedSpan.a.d);
            parcel.writeInt(spanned.getSpanStart(redactedSpan));
            parcel.writeInt(spanned.getSpanEnd(redactedSpan));
        }
        parcel.writeInt(-1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.d);
    }

    public RedactedSpan(Parcel parcel) {
        this.a = aasn.a(parcel.readInt());
    }
}
