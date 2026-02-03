package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ewdb;
import defpackage.ewdc;
import defpackage.ewdd;
import defpackage.ewdk;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ChatSessionReportEvent extends ChatSessionEvent implements Parcelable {
    public String b;
    public int c;
    private String d;

    public ChatSessionReportEvent(int i, int i2, String str, String str2, int i3) {
        this(i, 0L, i2);
        this.b = str;
        this.d = str2;
        this.c = i3;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.b = parcel.readString();
        this.d = parcel.readString();
        this.c = parcel.readInt();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event
    protected final void b(Parcel parcel) {
        parcel.writeString(getClass().getName());
    }

    @Override // com.google.android.ims.rcsservice.events.Event
    public final void e(ewdd ewddVar) {
        String str = this.b;
        if (str != null) {
            ewdb ewdbVar = (ewdb) ewdc.a.createBuilder();
            ewdbVar.copyOnWrite();
            ewdc ewdcVar = (ewdc) ewdbVar.instance;
            ewdcVar.b |= 1;
            ewdcVar.c = str;
            ewdc ewdcVar2 = (ewdc) ewdbVar.build();
            ewddVar.copyOnWrite();
            ewdk ewdkVar = (ewdk) ewddVar.instance;
            ewdk ewdkVar2 = ewdk.a;
            ewdcVar2.getClass();
            ewdkVar.d = ewdcVar2;
            ewdkVar.c = 4;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.ChatSessionEvent, com.google.android.ims.rcsservice.events.Event, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeInt(this.c);
    }

    public ChatSessionReportEvent(int i, long j, long j2) {
        super(i, j, j2);
    }

    public ChatSessionReportEvent(int i, String str, String str2, int i2) {
        this(i, 0, str, str2, i2);
    }

    public ChatSessionReportEvent(Parcel parcel) {
        super(parcel);
    }
}
