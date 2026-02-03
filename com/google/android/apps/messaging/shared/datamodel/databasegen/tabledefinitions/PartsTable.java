package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.athg;
import defpackage.athh;
import defpackage.barn;
import defpackage.bary;
import defpackage.bsce;
import defpackage.bscf;
import defpackage.bscg;
import defpackage.bscl;
import defpackage.bscm;
import defpackage.bsgr;
import defpackage.bsgs;
import defpackage.bsgt;
import defpackage.bsiv;
import defpackage.bsjc;
import defpackage.bsje;
import defpackage.bsjl;
import defpackage.bvdf;
import defpackage.bvdg;
import defpackage.bvdl;
import defpackage.bvdq;
import defpackage.bvdr;
import defpackage.bvdt;
import defpackage.bvdy;
import defpackage.bvef;
import defpackage.dqbw;
import defpackage.dqpd;
import defpackage.dqpf;
import defpackage.dqqe;
import defpackage.dqqj;
import defpackage.dqru;
import defpackage.dqsi;
import defpackage.dqsy;
import defpackage.dqxa;
import defpackage.ehli;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.evrr;
import defpackage.evsn;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PartsTable extends dqsi {
    public static final String[] a = {"parts._id", "parts.message_id", "parts.text", "parts.raw_text", "parts.uri", "parts.content_type", "parts.original_uri", "parts.storage_uri", "parts.width", "parts.height", "parts.timestamp", "parts.output_uri", "parts.target_size", "parts.processing_status", "parts.cms_attachment_processing_status", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "parts.preview_content_uri", "parts.preview_content_type", "parts.fallback_uri", "parts.source", "parts.bundle_index", "parts.blob_id", "parts.blob_gaia_email", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "parts.blob_upload_permanent_failure", "parts.blob_upload_timestamp", "parts.expressive_sticker_name", "parts.file_name", "parts.duration", "parts.compressed_blob_id", "parts.cms_compressed_blob_id", "parts.compressed_blob_upload_permanent_failure", "parts.compressed_blob_upload_timestamp", "parts.media_encryption_key", "parts.compressed_media_encryption_key", "parts.missing_entry_in_telephony", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "parts.media_send_type", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size"};
    public static final ekgp b;
    public static final ekgp c;
    public static final bsgr d;
    public static final int[] e;

    /* compiled from: PG */
    public static abstract class BindData extends dqpd<bsgt, bsjc, bsje, BindData, bsgs> implements Parcelable, dqpf {
        public static final Parcelable.Creator<BindData> CREATOR = new bsce();
        public String A;
        public String B;
        public String C;
        public byte[] D;
        public byte[] E;
        public String H;
        public String I;
        public long J;
        public String K;
        public String L;
        public byte[] O;
        public byte[] P;
        public boolean Q;
        public long S;
        public String T;
        public dqbw V;
        public String a;
        public String c;
        public String d;
        public Uri e;
        public String f;
        public Uri g;
        public Uri h;
        public long k;
        public Uri l;
        public Uri v;
        public String w;
        public Uri x;
        public MessageIdType b = bary.a;
        public int i = -1;
        public int j = -1;
        public long m = 0;
        public bvdt n = bvdt.SUCCEEDED;
        public bvdl o = bvdl.NOT_FROM_CMS;
        public ConversationIdType p = barn.a;
        public bvdg q = new bvdg(-1);
        public bvdg r = new bvdg(-1);
        public long s = -1;
        public double t = 0.0d;
        public double u = 0.0d;
        public int y = 13;
        public int z = 0;
        public boolean F = false;
        public long G = 0;
        public boolean M = false;
        public long N = 0;
        public boolean R = false;
        public bvdr U = bvdr.STANDARD;
        public bvef W = bvef.UNKNOWN;
        public athh X = null;
        public bvdy Y = bvdy.NONE;
        public bvdq Z = bvdq.DEFAULT_NO_VERDICT;
        public boolean aa = false;

        protected BindData() {
        }

        public final dqbw A() {
            aA(47, "voice_metadata");
            return this.V;
        }

        @Deprecated
        public final Long B() {
            final dqsy dqsyVarD = PartsTable.d();
            return Long.valueOf(dqru.b(PartsTable.d(), "parts", this, new Function() { // from class: bsca
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarD.O("parts", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bscb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.M((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final Long C() {
            final dqsy dqsyVarD = PartsTable.d();
            return Long.valueOf(dqru.b(PartsTable.d(), "parts", this, new Function() { // from class: bscc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dqsyVarD.P("parts", (dqst) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bscd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.N((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final String D() {
            aA(27, "blob_gaia_email");
            return this.B;
        }

        public final String E() {
            aA(26, "blob_id");
            return this.A;
        }

        public final String F() {
            aA(37, "cms_compressed_blob_id");
            return this.L;
        }

        public final String G() {
            aA(28, "cms_full_size_blob_id");
            return this.C;
        }

        public final String H() {
            aA(36, "compressed_blob_id");
            return this.K;
        }

        public final String I() {
            aA(5, "content_type");
            return this.f;
        }

        public final String J() {
            aA(34, "file_name");
            return this.I;
        }

        public final String K() {
            aA(0, "_id");
            return this.a;
        }

        public final String L() {
            aA(2, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            return this.c;
        }

        public final /* synthetic */ void M(Long l) {
            if (l.longValue() >= 0) {
                this.a = String.valueOf(l);
                super.fN(0);
            }
        }

        public final /* synthetic */ void N(Long l) {
            if (l.longValue() >= 0) {
                this.a = String.valueOf(l);
                super.fN(0);
            }
        }

        public final boolean O() {
            aA(31, "blob_upload_permanent_failure");
            return this.F;
        }

        public final boolean P() {
            aA(38, "compressed_blob_upload_permanent_failure");
            return this.M;
        }

        public final byte[] Q() {
            aA(29, "cms_media_encryption_key");
            return this.D;
        }

        public final byte[] R() {
            aA(41, "compressed_media_encryption_key");
            return this.P;
        }

        public final byte[] S() {
            aA(40, "media_encryption_key");
            return this.O;
        }

        @Override // defpackage.dqpd
        public final String a() {
            Locale locale = Locale.US;
            String strValueOf = String.valueOf(this.a);
            String strValueOf2 = String.valueOf(this.b);
            String strValueOf3 = String.valueOf(this.c);
            String strValueOf4 = String.valueOf(this.d);
            String strValueOf5 = String.valueOf(this.e);
            String strValueOf6 = String.valueOf(this.f);
            String strValueOf7 = String.valueOf(this.g);
            String strValueOf8 = String.valueOf(this.h);
            String strValueOf9 = String.valueOf(this.i);
            String strValueOf10 = String.valueOf(this.j);
            String strValueOf11 = String.valueOf(this.k);
            String strValueOf12 = String.valueOf(this.l);
            String strValueOf13 = String.valueOf(this.m);
            String strValueOf14 = String.valueOf(this.n);
            String strValueOf15 = String.valueOf(this.o);
            String strValueOf16 = String.valueOf(this.p);
            String strValueOf17 = String.valueOf(this.q);
            String strValueOf18 = String.valueOf(this.r);
            String strValueOf19 = String.valueOf(this.s);
            String strValueOf20 = String.valueOf(this.t);
            String strValueOf21 = String.valueOf(this.u);
            String strValueOf22 = String.valueOf(this.v);
            String strValueOf23 = String.valueOf(this.w);
            String strValueOf24 = String.valueOf(this.x);
            String strValueOf25 = String.valueOf(this.y);
            String strValueOf26 = String.valueOf(this.z);
            String strValueOf27 = String.valueOf(this.A);
            String strValueOf28 = String.valueOf(this.C);
            byte[] bArr = this.D;
            String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
            byte[] bArr2 = this.E;
            String strConcat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
            String strValueOf29 = String.valueOf(this.F);
            String strValueOf30 = String.valueOf(this.G);
            String strValueOf31 = String.valueOf(this.H);
            String strValueOf32 = String.valueOf(this.I);
            String strValueOf33 = String.valueOf(this.J);
            String strValueOf34 = String.valueOf(this.K);
            String strValueOf35 = String.valueOf(this.L);
            String strValueOf36 = String.valueOf(this.M);
            String strValueOf37 = String.valueOf(this.N);
            byte[] bArr3 = this.O;
            String strConcat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
            byte[] bArr4 = this.P;
            return String.format(locale, "PartsTable [_id: %s,\n  message_id: %s,\n  text: %s,\n  raw_text: %s,\n  uri: %s,\n  content_type: %s,\n  original_uri: %s,\n  storage_uri: %s,\n  width: %s,\n  height: %s,\n  timestamp: %s,\n  output_uri: %s,\n  target_size: %s,\n  processing_status: %s,\n  cms_attachment_processing_status: %s,\n  conversation_id: %s,\n  sticker_set_id: %s,\n  sticker_id: %s,\n  media_modified_timestamp: %s,\n  longitude: %s,\n  latitude: %s,\n  preview_content_uri: %s,\n  preview_content_type: %s,\n  fallback_uri: %s,\n  source: %s,\n  bundle_index: %s,\n  blob_id: %s,\n  blob_gaia_email: %s,\n  cms_full_size_blob_id: %s,\n  cms_media_encryption_key: %s,\n  cms_compressed_media_encryption_key: %s,\n  blob_upload_permanent_failure: %s,\n  blob_upload_timestamp: %s,\n  expressive_sticker_name: %s,\n  file_name: %s,\n  duration: %s,\n  compressed_blob_id: %s,\n  cms_compressed_blob_id: %s,\n  compressed_blob_upload_permanent_failure: %s,\n  compressed_blob_upload_timestamp: %s,\n  media_encryption_key: %s,\n  compressed_media_encryption_key: %s,\n  missing_entry_in_telephony: %s,\n  awaiting_reverse_sync: %s,\n  file_size_bytes: %s,\n  local_cache_path: %s,\n  media_send_type: %s,\n  voice_metadata: %s,\n  validation_status: %s,\n  processing_id: %s,\n  rich_card_media_download_failure_reason: %s,\n  image_display_state: %s,\n  preserve_size: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, "REDACTED", strValueOf28, strConcat, strConcat2, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strConcat3, "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL")), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa));
        }

        @Override // defpackage.dqpd
        public final void b(ContentValues contentValues) {
            int iIntValue = PartsTable.e().intValue();
            MessageIdType messageIdType = this.b;
            if (messageIdType == null || messageIdType.equals(bary.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
            }
            dqru.v(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.c);
            if (iIntValue >= 60990) {
                dqru.v(contentValues, "raw_text", this.d);
            }
            Uri uri = this.e;
            if (uri == null) {
                contentValues.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            } else {
                contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri.toString());
            }
            dqru.v(contentValues, "content_type", this.f);
            if (iIntValue >= 10021) {
                Uri uri2 = this.g;
                if (uri2 == null) {
                    contentValues.putNull("original_uri");
                } else {
                    contentValues.put("original_uri", uri2.toString());
                }
            }
            if (iIntValue >= 29060) {
                Uri uri3 = this.h;
                if (uri3 == null) {
                    contentValues.putNull("storage_uri");
                } else {
                    contentValues.put("storage_uri", uri3.toString());
                }
            }
            contentValues.put("width", Integer.valueOf(this.i));
            contentValues.put("height", Integer.valueOf(this.j));
            if (iIntValue >= 3010) {
                contentValues.put("timestamp", Long.valueOf(this.k));
            }
            if (iIntValue >= 4020) {
                Uri uri4 = this.l;
                if (uri4 == null) {
                    contentValues.putNull("output_uri");
                } else {
                    contentValues.put("output_uri", uri4.toString());
                }
            }
            if (iIntValue >= 4020) {
                contentValues.put("target_size", Long.valueOf(this.m));
            }
            if (iIntValue >= 4020) {
                bvdt bvdtVar = this.n;
                if (bvdtVar == null) {
                    contentValues.putNull("processing_status");
                } else {
                    contentValues.put("processing_status", Integer.valueOf(bvdtVar.ordinal()));
                }
            }
            if (iIntValue >= 44010) {
                bvdl bvdlVar = this.o;
                if (bvdlVar == null) {
                    contentValues.putNull("cms_attachment_processing_status");
                } else {
                    contentValues.put("cms_attachment_processing_status", Integer.valueOf(bvdlVar.ordinal()));
                }
            }
            ConversationIdType conversationIdType = this.p;
            if (conversationIdType == null || conversationIdType.equals(barn.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(barn.a(this.p)));
            }
            if (iIntValue >= 5020) {
                bvdg bvdgVar = this.q;
                if (bvdgVar == null) {
                    contentValues.putNull("sticker_set_id");
                } else {
                    contentValues.put("sticker_set_id", bvdf.b(bvdgVar));
                }
            }
            if (iIntValue >= 5020) {
                bvdg bvdgVar2 = this.r;
                if (bvdgVar2 == null) {
                    contentValues.putNull("sticker_id");
                } else {
                    contentValues.put("sticker_id", bvdf.b(bvdgVar2));
                }
            }
            if (iIntValue >= 7000) {
                contentValues.put("media_modified_timestamp", Long.valueOf(this.s));
            }
            if (iIntValue >= 10005) {
                contentValues.put("longitude", Double.valueOf(this.t));
            }
            if (iIntValue >= 10005) {
                contentValues.put("latitude", Double.valueOf(this.u));
            }
            if (iIntValue >= 10017) {
                Uri uri5 = this.v;
                if (uri5 == null) {
                    contentValues.putNull("preview_content_uri");
                } else {
                    contentValues.put("preview_content_uri", uri5.toString());
                }
            }
            if (iIntValue >= 10017) {
                dqru.v(contentValues, "preview_content_type", this.w);
            }
            if (iIntValue >= 13000) {
                Uri uri6 = this.x;
                if (uri6 == null) {
                    contentValues.putNull("fallback_uri");
                } else {
                    contentValues.put("fallback_uri", uri6.toString());
                }
            }
            if (iIntValue >= 14010) {
                contentValues.put("source", Integer.valueOf(this.y));
            }
            if (iIntValue >= 17010) {
                contentValues.put("bundle_index", Integer.valueOf(this.z));
            }
            if (iIntValue >= 17020) {
                dqru.v(contentValues, "blob_id", this.A);
            }
            if (iIntValue >= 59570) {
                dqru.v(contentValues, "blob_gaia_email", this.B);
            }
            if (iIntValue >= 40040) {
                dqru.v(contentValues, "cms_full_size_blob_id", this.C);
            }
            if (iIntValue >= 42010) {
                contentValues.put("cms_media_encryption_key", this.D);
            }
            if (iIntValue >= 42070) {
                contentValues.put("cms_compressed_media_encryption_key", this.E);
            }
            if (iIntValue >= 18000) {
                contentValues.put("blob_upload_permanent_failure", Boolean.valueOf(this.F));
            }
            if (iIntValue >= 19030) {
                contentValues.put("blob_upload_timestamp", Long.valueOf(this.G));
            }
            if (iIntValue >= 22060) {
                dqru.v(contentValues, "expressive_sticker_name", this.H);
            }
            if (iIntValue >= 26000) {
                dqru.v(contentValues, "file_name", this.I);
            }
            if (iIntValue >= 26040) {
                contentValues.put("duration", Long.valueOf(this.J));
            }
            if (iIntValue >= 27000) {
                dqru.v(contentValues, "compressed_blob_id", this.K);
            }
            if (iIntValue >= 40040) {
                dqru.v(contentValues, "cms_compressed_blob_id", this.L);
            }
            if (iIntValue >= 27000) {
                contentValues.put("compressed_blob_upload_permanent_failure", Boolean.valueOf(this.M));
            }
            if (iIntValue >= 27000) {
                contentValues.put("compressed_blob_upload_timestamp", Long.valueOf(this.N));
            }
            if (iIntValue >= 30040) {
                contentValues.put("media_encryption_key", this.O);
            }
            if (iIntValue >= 30040) {
                contentValues.put("compressed_media_encryption_key", this.P);
            }
            if (iIntValue >= 52030) {
                contentValues.put("missing_entry_in_telephony", Boolean.valueOf(this.Q));
            }
            if (iIntValue >= 53040) {
                contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.R));
            }
            if (iIntValue >= 52050) {
                contentValues.put("file_size_bytes", Long.valueOf(this.S));
            }
            if (iIntValue >= 52050) {
                dqru.v(contentValues, "local_cache_path", this.T);
            }
            if (iIntValue >= 58150) {
                bvdr bvdrVar = this.U;
                if (bvdrVar == null) {
                    contentValues.putNull("media_send_type");
                } else {
                    contentValues.put("media_send_type", Integer.valueOf(bvdrVar.ordinal()));
                }
            }
            if (iIntValue >= 59470) {
                dqbw dqbwVar = this.V;
                if (dqbwVar == null) {
                    contentValues.putNull("voice_metadata");
                } else {
                    contentValues.put("voice_metadata", dqbwVar.toByteArray());
                }
            }
            if (iIntValue >= 58770) {
                bvef bvefVar = this.W;
                if (bvefVar == null) {
                    contentValues.putNull("validation_status");
                } else {
                    contentValues.put("validation_status", Integer.valueOf(bvefVar.ordinal()));
                }
            }
            if (iIntValue >= 60080) {
                athh athhVar = this.X;
                if (athhVar == null) {
                    contentValues.putNull("processing_id");
                } else {
                    contentValues.put("processing_id", athg.b(athhVar));
                }
            }
            if (iIntValue >= 60230) {
                bvdy bvdyVar = this.Y;
                if (bvdyVar == null) {
                    contentValues.putNull("rich_card_media_download_failure_reason");
                } else {
                    contentValues.put("rich_card_media_download_failure_reason", Integer.valueOf(bvdyVar.ordinal()));
                }
            }
            if (iIntValue >= 60240) {
                bvdq bvdqVar = this.Z;
                if (bvdqVar == null) {
                    contentValues.putNull("image_display_state");
                } else {
                    contentValues.put("image_display_state", Integer.valueOf(bvdqVar.ordinal()));
                }
            }
            if (iIntValue >= 60680) {
                contentValues.put("preserve_size", Boolean.valueOf(this.aa));
            }
        }

        @Override // defpackage.dqpd
        protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
            bsiv bsivVar = (bsiv) ((bsgt) dqqjVar);
            aC();
            this.cN = bsivVar.cV();
            if (bsivVar.dj(0)) {
                this.a = bsivVar.p();
                super.fN(0);
            }
            if (bsivVar.dj(1)) {
                this.b = bsivVar.F();
                super.fN(1);
            }
            if (bsivVar.dj(2)) {
                this.c = bsivVar.V();
                super.fN(2);
            }
            if (bsivVar.dj(3)) {
                this.d = bsivVar.U();
                super.fN(3);
            }
            if (bsivVar.dj(4)) {
                this.e = bsivVar.i();
                super.fN(4);
            }
            if (bsivVar.dj(5)) {
                this.f = bsivVar.Q();
                super.fN(5);
            }
            if (bsivVar.dj(6)) {
                this.g = bsivVar.C();
                super.fN(6);
            }
            if (bsivVar.dj(7)) {
                this.h = bsivVar.D();
                super.fN(7);
            }
            if (bsivVar.dj(8)) {
                this.i = bsivVar.v();
                super.fN(8);
            }
            if (bsivVar.dj(9)) {
                this.j = bsivVar.u();
                super.fN(9);
            }
            if (bsivVar.dj(10)) {
                this.k = bsivVar.B();
                super.fN(10);
            }
            if (bsivVar.dj(11)) {
                this.l = bsivVar.h();
                super.fN(11);
            }
            if (bsivVar.dj(12)) {
                this.m = bsivVar.A();
                super.fN(12);
            }
            if (bsivVar.dj(13)) {
                this.n = bsivVar.L();
                super.fN(13);
            }
            if (bsivVar.dj(14)) {
                this.o = bsivVar.I();
                super.fN(14);
            }
            if (bsivVar.dj(15)) {
                this.p = bsivVar.E();
                super.fN(15);
            }
            if (bsivVar.dj(16)) {
                this.q = bsivVar.H();
                super.fN(16);
            }
            if (bsivVar.dj(17)) {
                this.r = bsivVar.G();
                super.fN(17);
            }
            if (bsivVar.dj(18)) {
                this.s = bsivVar.z();
                super.fN(18);
            }
            if (bsivVar.dj(19)) {
                this.t = bsivVar.s();
                super.fN(19);
            }
            if (bsivVar.dj(20)) {
                this.u = bsivVar.r();
                super.fN(20);
            }
            if (bsivVar.dj(21)) {
                this.v = bsivVar.g();
                super.fN(21);
            }
            if (bsivVar.dj(22)) {
                this.w = bsivVar.T();
                super.fN(22);
            }
            if (bsivVar.dj(23)) {
                this.x = bsivVar.f();
                super.fN(23);
            }
            if (bsivVar.dj(24)) {
                this.y = bsivVar.c();
                super.fN(24);
            }
            if (bsivVar.dj(25)) {
                this.z = bsivVar.t();
                super.fN(25);
            }
            if (bsivVar.dj(26)) {
                this.A = bsivVar.l();
                super.fN(26);
            }
            if (bsivVar.dj(27)) {
                this.B = bsivVar.P();
                super.fN(27);
            }
            if (bsivVar.dj(28)) {
                this.C = bsivVar.n();
                super.fN(28);
            }
            if (bsivVar.dj(29)) {
                this.D = bsivVar.ac();
                super.fN(29);
            }
            if (bsivVar.dj(30)) {
                this.E = bsivVar.ab();
                super.fN(30);
            }
            if (bsivVar.dj(31)) {
                this.F = bsivVar.X();
                super.fN(31);
            }
            if (bsivVar.dj(32)) {
                this.G = bsivVar.w();
                super.fN(32);
            }
            if (bsivVar.dj(33)) {
                this.H = bsivVar.R();
                super.fN(33);
            }
            if (bsivVar.dj(34)) {
                this.I = bsivVar.S();
                super.fN(34);
            }
            if (bsivVar.dj(35)) {
                this.J = bsivVar.y();
                super.fN(35);
            }
            if (bsivVar.dj(36)) {
                this.K = bsivVar.o();
                super.fN(36);
            }
            if (bsivVar.dj(37)) {
                this.L = bsivVar.m();
                super.fN(37);
            }
            if (bsivVar.dj(38)) {
                this.M = bsivVar.Y();
                super.fN(38);
            }
            if (bsivVar.dj(39)) {
                this.N = bsivVar.x();
                super.fN(39);
            }
            if (bsivVar.dj(40)) {
                this.O = bsivVar.ae();
                super.fN(40);
            }
            if (bsivVar.dj(41)) {
                this.P = bsivVar.ad();
                super.fN(41);
            }
            if (bsivVar.dj(42)) {
                this.Q = bsivVar.Z();
                super.fN(42);
            }
            if (bsivVar.dj(43)) {
                this.R = bsivVar.W();
                super.fN(43);
            }
            if (bsivVar.dj(44)) {
                this.S = bsivVar.e();
                super.fN(44);
            }
            if (bsivVar.dj(45)) {
                this.T = bsivVar.q();
                super.fN(45);
            }
            if (bsivVar.dj(46)) {
                this.U = bsivVar.K();
                super.fN(46);
            }
            if (bsivVar.dj(47)) {
                this.V = bsivVar.O();
                super.fN(47);
            }
            if (bsivVar.dj(48)) {
                this.W = bsivVar.N();
                super.fN(48);
            }
            if (bsivVar.dj(49)) {
                this.X = bsivVar.j();
                super.fN(49);
            }
            if (bsivVar.dj(50)) {
                this.Y = bsivVar.M();
                super.fN(50);
            }
            if (bsivVar.dj(51)) {
                this.Z = bsivVar.J();
                super.fN(51);
            }
            if (bsivVar.dj(52)) {
                this.aa = bsivVar.aa();
                super.fN(52);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            return super.aE(bindData.cN) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && Objects.equals(this.e, bindData.e) && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && this.i == bindData.i && this.j == bindData.j && this.k == bindData.k && Objects.equals(this.l, bindData.l) && this.m == bindData.m && this.n == bindData.n && this.o == bindData.o && Objects.equals(this.p, bindData.p) && Objects.equals(this.q, bindData.q) && Objects.equals(this.r, bindData.r) && this.s == bindData.s && this.t == bindData.t && this.u == bindData.u && Objects.equals(this.v, bindData.v) && Objects.equals(this.w, bindData.w) && Objects.equals(this.x, bindData.x) && this.y == bindData.y && this.z == bindData.z && Objects.equals(this.A, bindData.A) && Objects.equals(this.B, bindData.B) && Objects.equals(this.C, bindData.C) && Arrays.equals(this.D, bindData.D) && Arrays.equals(this.E, bindData.E) && this.F == bindData.F && this.G == bindData.G && Objects.equals(this.H, bindData.H) && Objects.equals(this.I, bindData.I) && this.J == bindData.J && Objects.equals(this.K, bindData.K) && Objects.equals(this.L, bindData.L) && this.M == bindData.M && this.N == bindData.N && Arrays.equals(this.O, bindData.O) && Arrays.equals(this.P, bindData.P) && this.Q == bindData.Q && this.R == bindData.R && this.S == bindData.S && Objects.equals(this.T, bindData.T) && this.U == bindData.U && Objects.equals(this.V, bindData.V) && this.W == bindData.W && Objects.equals(this.X, bindData.X) && this.Y == bindData.Y && this.Z == bindData.Z && this.aa == bindData.aa;
        }

        @Override // defpackage.dqpf
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "parts", dqru.m(new String[]{"message_id", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "raw_text", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, "content_type", "original_uri", "storage_uri", "width", "height", "timestamp", "output_uri", "target_size", "processing_status", "cms_attachment_processing_status", "conversation_id", "sticker_set_id", "sticker_id", "media_modified_timestamp", "longitude", "latitude", "preview_content_uri", "preview_content_type", "fallback_uri", "source", "bundle_index", "blob_id", "blob_gaia_email", "cms_full_size_blob_id", "cms_media_encryption_key", "cms_compressed_media_encryption_key", "blob_upload_permanent_failure", "blob_upload_timestamp", "expressive_sticker_name", "file_name", "duration", "compressed_blob_id", "cms_compressed_blob_id", "compressed_blob_upload_permanent_failure", "compressed_blob_upload_timestamp", "media_encryption_key", "compressed_media_encryption_key", "missing_entry_in_telephony", "awaiting_reverse_sync", "file_size_bytes", "local_cache_path", "media_send_type", "voice_metadata", "validation_status", "processing_id", "rich_card_media_download_failure_reason", "image_display_state", "preserve_size"}));
        }

        @Override // defpackage.dqpd
        protected final void fD(Parcel parcel) {
            dqbw dqbwVar;
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            this.c = parcel.readString();
            this.d = parcel.readString();
            String string = parcel.readString();
            this.e = string == null ? null : Uri.parse(string);
            this.f = parcel.readString();
            String string2 = parcel.readString();
            this.g = string2 == null ? null : Uri.parse(string2);
            String string3 = parcel.readString();
            this.h = string3 == null ? null : Uri.parse(string3);
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readLong();
            String string4 = parcel.readString();
            this.l = string4 == null ? null : Uri.parse(string4);
            this.m = parcel.readLong();
            bvdt[] bvdtVarArrValues = bvdt.values();
            int i = parcel.readInt();
            if (i >= 0) {
                if (i >= bvdtVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.n = bvdtVarArrValues[i];
            }
            bvdl[] bvdlVarArrValues = bvdl.values();
            int i2 = parcel.readInt();
            if (i2 >= 0) {
                if (i2 >= bvdlVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.o = bvdlVarArrValues[i2];
            }
            this.p = new ConversationIdType(parcel.readLong());
            this.q = bvdf.a(parcel.readString());
            this.r = bvdf.a(parcel.readString());
            this.s = parcel.readLong();
            this.t = parcel.readDouble();
            this.u = parcel.readDouble();
            String string5 = parcel.readString();
            this.v = string5 == null ? null : Uri.parse(string5);
            this.w = parcel.readString();
            String string6 = parcel.readString();
            this.x = string6 == null ? null : Uri.parse(string6);
            this.y = parcel.readInt();
            this.z = parcel.readInt();
            this.A = parcel.readString();
            this.B = parcel.readString();
            this.C = parcel.readString();
            this.D = parcel.createByteArray();
            this.E = parcel.createByteArray();
            this.F = parcel.readInt() == 1;
            this.G = parcel.readLong();
            this.H = parcel.readString();
            this.I = parcel.readString();
            this.J = parcel.readLong();
            this.K = parcel.readString();
            this.L = parcel.readString();
            this.M = parcel.readInt() == 1;
            this.N = parcel.readLong();
            this.O = parcel.createByteArray();
            this.P = parcel.createByteArray();
            this.Q = parcel.readInt() == 1;
            this.R = parcel.readInt() == 1;
            this.S = parcel.readLong();
            this.T = parcel.readString();
            bvdr[] bvdrVarArrValues = bvdr.values();
            int i3 = parcel.readInt();
            if (i3 >= 0) {
                if (i3 >= bvdrVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.U = bvdrVarArrValues[i3];
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            if (bArrCreateByteArray == null) {
                dqbwVar = null;
            } else {
                try {
                    dqbwVar = (dqbw) evsn.parseFrom(dqbw.a, bArrCreateByteArray, evrr.a());
                } catch (Throwable unused) {
                    this.V = null;
                }
            }
            this.V = dqbwVar;
            bvef[] bvefVarArrValues = bvef.values();
            int i4 = parcel.readInt();
            if (i4 >= 0) {
                if (i4 >= bvefVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.W = bvefVarArrValues[i4];
            }
            this.X = athg.a(parcel.readString());
            bvdy[] bvdyVarArrValues = bvdy.values();
            int i5 = parcel.readInt();
            if (i5 >= 0) {
                if (i5 >= bvdyVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.Y = bvdyVarArrValues[i5];
            }
            bvdq[] bvdqVarArrValues = bvdq.values();
            int i6 = parcel.readInt();
            if (i6 >= 0) {
                if (i6 >= bvdqVarArrValues.length) {
                    throw new IllegalArgumentException();
                }
                this.Z = bvdqVarArrValues[i6];
            }
            this.aa = parcel.readInt() == 1;
        }

        @Override // defpackage.dqpd
        protected final void fE(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bary.a(this.b));
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            Uri uri = this.e;
            parcel.writeString(uri == null ? null : uri.toString());
            parcel.writeString(this.f);
            Uri uri2 = this.g;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.h;
            parcel.writeString(uri3 == null ? null : uri3.toString());
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeLong(this.k);
            Uri uri4 = this.l;
            parcel.writeString(uri4 == null ? null : uri4.toString());
            parcel.writeLong(this.m);
            bvdt bvdtVar = this.n;
            parcel.writeInt(bvdtVar == null ? -1 : bvdtVar.ordinal());
            bvdl bvdlVar = this.o;
            parcel.writeInt(bvdlVar == null ? -1 : bvdlVar.ordinal());
            parcel.writeLong(barn.a(this.p));
            parcel.writeString(bvdf.b(this.q));
            parcel.writeString(bvdf.b(this.r));
            parcel.writeLong(this.s);
            parcel.writeDouble(this.t);
            parcel.writeDouble(this.u);
            Uri uri5 = this.v;
            parcel.writeString(uri5 == null ? null : uri5.toString());
            parcel.writeString(this.w);
            Uri uri6 = this.x;
            parcel.writeString(uri6 == null ? null : uri6.toString());
            parcel.writeInt(this.y);
            parcel.writeInt(this.z);
            parcel.writeString(this.A);
            parcel.writeString(this.B);
            parcel.writeString(this.C);
            parcel.writeByteArray(this.D);
            parcel.writeByteArray(this.E);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeLong(this.G);
            parcel.writeString(this.H);
            parcel.writeString(this.I);
            parcel.writeLong(this.J);
            parcel.writeString(this.K);
            parcel.writeString(this.L);
            parcel.writeInt(this.M ? 1 : 0);
            parcel.writeLong(this.N);
            parcel.writeByteArray(this.O);
            parcel.writeByteArray(this.P);
            parcel.writeInt(this.Q ? 1 : 0);
            parcel.writeInt(this.R ? 1 : 0);
            parcel.writeLong(this.S);
            parcel.writeString(this.T);
            bvdr bvdrVar = this.U;
            parcel.writeInt(bvdrVar == null ? -1 : bvdrVar.ordinal());
            dqbw dqbwVar = this.V;
            parcel.writeByteArray(dqbwVar != null ? dqbwVar.toByteArray() : null);
            bvef bvefVar = this.W;
            parcel.writeInt(bvefVar == null ? -1 : bvefVar.ordinal());
            parcel.writeString(athg.b(this.X));
            bvdy bvdyVar = this.Y;
            parcel.writeInt(bvdyVar == null ? -1 : bvdyVar.ordinal());
            bvdq bvdqVar = this.Z;
            parcel.writeInt(bvdqVar != null ? bvdqVar.ordinal() : -1);
            parcel.writeInt(this.aa ? 1 : 0);
        }

        @Override // defpackage.dqpd
        public final void fN(int i) {
            super.fN(0);
        }

        @Override // defpackage.dqpf
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dqpf
        public final String h() {
            return "parts";
        }

        public final int hashCode() {
            dqqe dqqeVar = this.cN;
            dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
            String str = this.a;
            MessageIdType messageIdType = this.b;
            String str2 = this.c;
            String str3 = this.d;
            Uri uri = this.e;
            String str4 = this.f;
            Uri uri2 = this.g;
            Uri uri3 = this.h;
            Integer numValueOf = Integer.valueOf(this.i);
            Integer numValueOf2 = Integer.valueOf(this.j);
            Long lValueOf = Long.valueOf(this.k);
            Uri uri4 = this.l;
            Long lValueOf2 = Long.valueOf(this.m);
            bvdt bvdtVar = this.n;
            Integer numValueOf3 = Integer.valueOf(bvdtVar == null ? 0 : bvdtVar.ordinal());
            bvdl bvdlVar = this.o;
            Integer numValueOf4 = Integer.valueOf(bvdlVar == null ? 0 : bvdlVar.ordinal());
            dqqe dqqeVar3 = dqqeVar2;
            ConversationIdType conversationIdType = this.p;
            bvdg bvdgVar = this.q;
            bvdg bvdgVar2 = this.r;
            Long lValueOf3 = Long.valueOf(this.s);
            Double dValueOf = Double.valueOf(this.t);
            Double dValueOf2 = Double.valueOf(this.u);
            Uri uri5 = this.v;
            String str5 = this.w;
            Uri uri6 = this.x;
            Integer numValueOf5 = Integer.valueOf(this.y);
            Integer numValueOf6 = Integer.valueOf(this.z);
            String str6 = this.A;
            String str7 = this.B;
            String str8 = this.C;
            Integer numValueOf7 = Integer.valueOf(Arrays.hashCode(this.D));
            Integer numValueOf8 = Integer.valueOf(Arrays.hashCode(this.E));
            Boolean boolValueOf = Boolean.valueOf(this.F);
            Long lValueOf4 = Long.valueOf(this.G);
            String str9 = this.H;
            String str10 = this.I;
            Long lValueOf5 = Long.valueOf(this.J);
            String str11 = this.K;
            String str12 = this.L;
            Boolean boolValueOf2 = Boolean.valueOf(this.M);
            Long lValueOf6 = Long.valueOf(this.N);
            Integer numValueOf9 = Integer.valueOf(Arrays.hashCode(this.O));
            Integer numValueOf10 = Integer.valueOf(Arrays.hashCode(this.P));
            Boolean boolValueOf3 = Boolean.valueOf(this.Q);
            Boolean boolValueOf4 = Boolean.valueOf(this.R);
            Long lValueOf7 = Long.valueOf(this.S);
            String str13 = this.T;
            bvdr bvdrVar = this.U;
            Integer numValueOf11 = Integer.valueOf(bvdrVar == null ? 0 : bvdrVar.ordinal());
            dqbw dqbwVar = this.V;
            bvef bvefVar = this.W;
            Integer numValueOf12 = Integer.valueOf(bvefVar == null ? 0 : bvefVar.ordinal());
            athh athhVar = this.X;
            bvdy bvdyVar = this.Y;
            Integer numValueOf13 = Integer.valueOf(bvdyVar == null ? 0 : bvdyVar.ordinal());
            bvdq bvdqVar = this.Z;
            return Objects.hash(dqqeVar3, str, messageIdType, str2, str3, uri, str4, uri2, uri3, numValueOf, numValueOf2, lValueOf, uri4, lValueOf2, numValueOf3, numValueOf4, conversationIdType, bvdgVar, bvdgVar2, lValueOf3, dValueOf, dValueOf2, uri5, str5, uri6, numValueOf5, numValueOf6, str6, str7, str8, numValueOf7, numValueOf8, boolValueOf, lValueOf4, str9, str10, lValueOf5, str11, str12, boolValueOf2, lValueOf6, numValueOf9, numValueOf10, boolValueOf3, boolValueOf4, lValueOf7, str13, numValueOf11, dqbwVar, numValueOf12, athhVar, numValueOf13, Integer.valueOf(bvdqVar == null ? 0 : bvdqVar.ordinal()), Boolean.valueOf(this.aa), null);
        }

        @Override // defpackage.dqpf
        public final void i(StringBuilder sb, List list) {
            Object obj = new bscf(this).get();
            String str = this.c;
            String str2 = this.d;
            Uri uri = this.e;
            String string = uri == null ? null : uri.toString();
            String str3 = this.f;
            Uri uri2 = this.g;
            String string2 = uri2 == null ? null : uri2.toString();
            Uri uri3 = this.h;
            String string3 = uri3 == null ? null : uri3.toString();
            Integer numValueOf = Integer.valueOf(this.i);
            Integer numValueOf2 = Integer.valueOf(this.j);
            Long lValueOf = Long.valueOf(this.k);
            Uri uri4 = this.l;
            String string4 = uri4 == null ? null : uri4.toString();
            Long lValueOf2 = Long.valueOf(this.m);
            bvdt bvdtVar = this.n;
            Object objValueOf = bvdtVar == null ? 0 : String.valueOf(bvdtVar.ordinal());
            bvdl bvdlVar = this.o;
            Object objValueOf2 = bvdlVar == null ? 0 : String.valueOf(bvdlVar.ordinal());
            Object obj2 = new bscg(this).get();
            String strB = bvdf.b(this.q);
            String strB2 = bvdf.b(this.r);
            Long lValueOf3 = Long.valueOf(this.s);
            Double dValueOf = Double.valueOf(this.t);
            Double dValueOf2 = Double.valueOf(this.u);
            Uri uri5 = this.v;
            String string5 = uri5 == null ? null : uri5.toString();
            String str4 = this.w;
            Uri uri6 = this.x;
            String string6 = uri6 == null ? null : uri6.toString();
            Integer numValueOf3 = Integer.valueOf(this.y);
            Integer numValueOf4 = Integer.valueOf(this.z);
            String str5 = this.A;
            String str6 = this.B;
            String str7 = this.C;
            byte[] bArr = this.D;
            byte[] bArr2 = this.E;
            Integer numValueOf5 = Integer.valueOf(this.F ? 1 : 0);
            String str8 = string5;
            Long lValueOf4 = Long.valueOf(this.G);
            String str9 = this.H;
            String str10 = this.I;
            Long lValueOf5 = Long.valueOf(this.J);
            String str11 = this.K;
            String str12 = this.L;
            Integer numValueOf6 = Integer.valueOf(this.M ? 1 : 0);
            Long lValueOf6 = Long.valueOf(this.N);
            byte[] bArr3 = this.O;
            byte[] bArr4 = this.P;
            Integer numValueOf7 = Integer.valueOf(this.Q ? 1 : 0);
            Integer numValueOf8 = Integer.valueOf(this.R ? 1 : 0);
            Long lValueOf7 = Long.valueOf(this.S);
            String str13 = this.T;
            bvdr bvdrVar = this.U;
            Object objValueOf3 = bvdrVar == null ? 0 : String.valueOf(bvdrVar.ordinal());
            dqbw dqbwVar = this.V;
            byte[] byteArray = dqbwVar == null ? null : dqbwVar.toByteArray();
            bvef bvefVar = this.W;
            Object objValueOf4 = bvefVar == null ? 0 : String.valueOf(bvefVar.ordinal());
            String strB3 = athg.b(this.X);
            bvdy bvdyVar = this.Y;
            Object objValueOf5 = bvdyVar == null ? 0 : String.valueOf(bvdyVar.ordinal());
            bvdq bvdqVar = this.Z;
            Object[] objArr = {obj, str, str2, string, str3, string2, string3, numValueOf, numValueOf2, lValueOf, string4, lValueOf2, objValueOf, objValueOf2, obj2, strB, strB2, lValueOf3, dValueOf, dValueOf2, str8, str4, string6, numValueOf3, numValueOf4, str5, str6, str7, bArr, bArr2, numValueOf5, lValueOf4, str9, str10, lValueOf5, str11, str12, numValueOf6, lValueOf6, bArr3, bArr4, numValueOf7, numValueOf8, lValueOf7, str13, objValueOf3, byteArray, objValueOf4, strB3, objValueOf5, bvdqVar == null ? 0 : String.valueOf(bvdqVar.ordinal()), Integer.valueOf(this.aa ? 1 : 0)};
            sb.append('(');
            for (int i = 0; i < 52; i++) {
                Object obj3 = objArr[i];
                if (obj3 instanceof Number) {
                    sb.append(String.valueOf(obj3));
                } else {
                    if (obj3 instanceof String) {
                        String str14 = (String) obj3;
                        if (str14.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str14));
                        }
                    }
                    list.add(obj3);
                    sb.append('?');
                    sb.append(',');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        @Override // defpackage.dqpf
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final double k() {
            aA(20, "latitude");
            return this.u;
        }

        public final double m() {
            aA(19, "longitude");
            return this.t;
        }

        public final int n() {
            aA(9, "height");
            return this.j;
        }

        public final int o() {
            aA(8, "width");
            return this.i;
        }

        public final long p() {
            aA(32, "blob_upload_timestamp");
            return this.G;
        }

        public final long q() {
            aA(39, "compressed_blob_upload_timestamp");
            return this.N;
        }

        public final long r() {
            aA(35, "duration");
            return this.J;
        }

        public final long s() {
            aA(12, "target_size");
            return this.m;
        }

        public final Uri t() {
            aA(4, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            return this.e;
        }

        public final String toString() {
            return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "PartsTable -- REDACTED") : a();
        }

        public final ConversationIdType u() {
            aA(15, "conversation_id");
            return this.p;
        }

        public final MessageIdType v() {
            aA(1, "message_id");
            return this.b;
        }

        public final bscl w() {
            bscm bscmVar = new bscm();
            bscmVar.c(this, false, this.cL);
            return bscmVar;
        }

        public final bscl x() {
            bscm bscmVar = new bscm();
            bscmVar.c(this, true, this.cL);
            return bscmVar;
        }

        public final bvdl y() {
            aA(14, "cms_attachment_processing_status");
            return this.o;
        }

        public final bvdq z() {
            aA(51, "image_display_state");
            return this.Z;
        }

        protected BindData(Parcel parcel) {
            aB(parcel);
        }
    }

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("parts.raw_text", 60990);
        ekgiVar.i("parts.original_uri", 10021);
        ekgiVar.i("parts.storage_uri", 29060);
        ekgiVar.i("parts.timestamp", 3010);
        ekgiVar.i("parts.output_uri", 4020);
        ekgiVar.i("parts.target_size", 4020);
        ekgiVar.i("parts.processing_status", 4020);
        ekgiVar.i("parts.cms_attachment_processing_status", 44010);
        ekgiVar.i("parts.sticker_set_id", 5020);
        ekgiVar.i("parts.sticker_id", 5020);
        ekgiVar.i("parts.media_modified_timestamp", 7000);
        ekgiVar.i("parts.longitude", 10005);
        ekgiVar.i("parts.latitude", 10005);
        ekgiVar.i("parts.preview_content_uri", 10017);
        ekgiVar.i("parts.preview_content_type", 10017);
        ekgiVar.i("parts.fallback_uri", 13000);
        ekgiVar.i("parts.source", 14010);
        ekgiVar.i("parts.bundle_index", 17010);
        ekgiVar.i("parts.blob_id", 17020);
        ekgiVar.i("parts.blob_gaia_email", 59570);
        ekgiVar.i("parts.cms_full_size_blob_id", 40040);
        ekgiVar.i("parts.cms_media_encryption_key", 42010);
        ekgiVar.i("parts.cms_compressed_media_encryption_key", 42070);
        ekgiVar.i("parts.blob_upload_permanent_failure", 18000);
        ekgiVar.i("parts.blob_upload_timestamp", 19030);
        ekgiVar.i("parts.expressive_sticker_name", 22060);
        ekgiVar.i("parts.file_name", 26000);
        ekgiVar.i("parts.duration", 26040);
        ekgiVar.i("parts.compressed_blob_id", 27000);
        ekgiVar.i("parts.cms_compressed_blob_id", 40040);
        ekgiVar.i("parts.compressed_blob_upload_permanent_failure", 27000);
        ekgiVar.i("parts.compressed_blob_upload_timestamp", 27000);
        ekgiVar.i("parts.media_encryption_key", 30040);
        ekgiVar.i("parts.compressed_media_encryption_key", 30040);
        ekgiVar.i("parts.missing_entry_in_telephony", 52030);
        ekgiVar.i("parts.awaiting_reverse_sync", 53040);
        ekgiVar.i("parts.file_size_bytes", 52050);
        ekgiVar.i("parts.local_cache_path", 52050);
        ekgiVar.i("parts.media_send_type", 58150);
        ekgiVar.i("parts.voice_metadata", 59470);
        ekgiVar.i("parts.validation_status", 58770);
        ekgiVar.i("parts.processing_id", 60080);
        ekgiVar.i("parts.rich_card_media_download_failure_reason", 60230);
        ekgiVar.i("parts.image_display_state", 60240);
        ekgiVar.i("parts.preserve_size", 60680);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_parts_message_id");
        ekgiVar2.i("content_type", "index_parts_content_type");
        ekgiVar2.i("output_uri", "index_parts_output_uri");
        ekgiVar2.i("conversation_id", "index_parts_conversation_id");
        ekgiVar2.i("preview_content_type", "index_parts_preview_content_type");
        ekgiVar2.i("file_size_bytes", "index_parts_file_size_bytes");
        ekgiVar2.i("local_cache_path", "index_parts_local_cache_path");
        c = ekgiVar2.c();
        d = new bsgr();
        e = new int[]{3010, 4020, 5020, 7000, 10005, 10017, 10021, 13000, 14010, 17010, 17020, 18000, 19030, 22060, 26000, 26040, 27000, 29060, 30040, 40040, 42010, 42070, 44010, 49010, 52030, 52050, 53040, 58150, 58380, 58770, 59470, 59570, 60080, 60230, 60240, 60680, 60990};
    }

    public static BindData a(String str) {
        bsje bsjeVarC = c();
        bsjeVarC.A("parts.queryOnId");
        bsjeVarC.q();
        bsjl bsjlVar = new bsjl();
        bsjlVar.j(str);
        bsjeVarC.g(bsjlVar);
        return (BindData) dqru.c(bsjeVarC.b());
    }

    public static bscl b() {
        bscm bscmVar = new bscm();
        bscmVar.aF();
        return bscmVar;
    }

    public static final bsje c() {
        String[] strArr;
        Integer numE = e();
        if (numE.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("parts._id");
            ekfwVar.h("parts.message_id");
            ekfwVar.h("parts.text");
            if (numE.intValue() >= 60990) {
                ekfwVar.h("parts.raw_text");
            }
            ekfwVar.h("parts.uri");
            ekfwVar.h("parts.content_type");
            if (numE.intValue() >= 10021) {
                ekfwVar.h("parts.original_uri");
            }
            if (numE.intValue() >= 29060) {
                ekfwVar.h("parts.storage_uri");
            }
            ekfwVar.h("parts.width");
            ekfwVar.h("parts.height");
            if (numE.intValue() >= 3010) {
                ekfwVar.h("parts.timestamp");
            }
            if (numE.intValue() >= 4020) {
                ekfwVar.h("parts.output_uri");
            }
            if (numE.intValue() >= 4020) {
                ekfwVar.h("parts.target_size");
            }
            if (numE.intValue() >= 4020) {
                ekfwVar.h("parts.processing_status");
            }
            if (numE.intValue() >= 44010) {
                ekfwVar.h("parts.cms_attachment_processing_status");
            }
            ekfwVar.h("parts.conversation_id");
            if (numE.intValue() >= 5020) {
                ekfwVar.h("parts.sticker_set_id");
            }
            if (numE.intValue() >= 5020) {
                ekfwVar.h("parts.sticker_id");
            }
            if (numE.intValue() >= 7000) {
                ekfwVar.h("parts.media_modified_timestamp");
            }
            if (numE.intValue() >= 10005) {
                ekfwVar.h("parts.longitude");
            }
            if (numE.intValue() >= 10005) {
                ekfwVar.h("parts.latitude");
            }
            if (numE.intValue() >= 10017) {
                ekfwVar.h("parts.preview_content_uri");
            }
            if (numE.intValue() >= 10017) {
                ekfwVar.h("parts.preview_content_type");
            }
            if (numE.intValue() >= 13000) {
                ekfwVar.h("parts.fallback_uri");
            }
            if (numE.intValue() >= 14010) {
                ekfwVar.h("parts.source");
            }
            if (numE.intValue() >= 17010) {
                ekfwVar.h("parts.bundle_index");
            }
            if (numE.intValue() >= 17020) {
                ekfwVar.h("parts.blob_id");
            }
            if (numE.intValue() >= 59570) {
                ekfwVar.h("parts.blob_gaia_email");
            }
            if (numE.intValue() >= 40040) {
                ekfwVar.h("parts.cms_full_size_blob_id");
            }
            if (numE.intValue() >= 42010) {
                ekfwVar.h("parts.cms_media_encryption_key");
            }
            if (numE.intValue() >= 42070) {
                ekfwVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (numE.intValue() >= 18000) {
                ekfwVar.h("parts.blob_upload_permanent_failure");
            }
            if (numE.intValue() >= 19030) {
                ekfwVar.h("parts.blob_upload_timestamp");
            }
            if (numE.intValue() >= 22060) {
                ekfwVar.h("parts.expressive_sticker_name");
            }
            if (numE.intValue() >= 26000) {
                ekfwVar.h("parts.file_name");
            }
            if (numE.intValue() >= 26040) {
                ekfwVar.h("parts.duration");
            }
            if (numE.intValue() >= 27000) {
                ekfwVar.h("parts.compressed_blob_id");
            }
            if (numE.intValue() >= 40040) {
                ekfwVar.h("parts.cms_compressed_blob_id");
            }
            if (numE.intValue() >= 27000) {
                ekfwVar.h("parts.compressed_blob_upload_permanent_failure");
            }
            if (numE.intValue() >= 27000) {
                ekfwVar.h("parts.compressed_blob_upload_timestamp");
            }
            if (numE.intValue() >= 30040) {
                ekfwVar.h("parts.media_encryption_key");
            }
            if (numE.intValue() >= 30040) {
                ekfwVar.h("parts.compressed_media_encryption_key");
            }
            if (numE.intValue() >= 52030) {
                ekfwVar.h("parts.missing_entry_in_telephony");
            }
            if (numE.intValue() >= 53040) {
                ekfwVar.h("parts.awaiting_reverse_sync");
            }
            if (numE.intValue() >= 52050) {
                ekfwVar.h("parts.file_size_bytes");
            }
            if (numE.intValue() >= 52050) {
                ekfwVar.h("parts.local_cache_path");
            }
            if (numE.intValue() >= 58150) {
                ekfwVar.h("parts.media_send_type");
            }
            if (numE.intValue() >= 59470) {
                ekfwVar.h("parts.voice_metadata");
            }
            if (numE.intValue() >= 58770) {
                ekfwVar.h("parts.validation_status");
            }
            if (numE.intValue() >= 60080) {
                ekfwVar.h("parts.processing_id");
            }
            if (numE.intValue() >= 60230) {
                ekfwVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (numE.intValue() >= 60240) {
                ekfwVar.h("parts.image_display_state");
            }
            if (numE.intValue() >= 60680) {
                ekfwVar.h("parts.preserve_size");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bsje(strArr);
    }

    public static dqsy d() {
        return dqru.e("$primary");
    }

    public static Integer e() {
        return Integer.valueOf(g().a());
    }

    public static void f(dqsy dqsyVar) {
        dqsyVar.v("ALTER TABLE parts ADD COLUMN blob_upload_timestamp INT DEFAULT(0);");
    }

    public static dqxa g() {
        return d().M();
    }
}
