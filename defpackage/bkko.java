package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkko {
    public final bkkp a;

    public bkko() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 1;
        dqprVarM.d(true);
        dqprVarM.e(true);
        dqogVar.b = new Supplier() { // from class: bkgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar.a = "parts.message_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bkhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar.c = new dqps() { // from class: bkhr
        };
        dqprVarM.a();
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 2;
        dqprVarM2.l(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "parts._id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bkid
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: bkip
        };
        this.a = new bkkp(dqprVarM2.a());
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "parts.text";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bkjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: bkjn
        };
        dqprVarM3.a();
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "parts.raw_text";
        dqprVarM4.i(60990);
        dqogVar4.d = new Supplier() { // from class: bkjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar4.c = new dqps() { // from class: bkkl
        };
        dqprVarM4.a();
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "parts.uri";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bkgs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar5.c = new dqps() { // from class: bkgu
        };
        dqprVarM5.a();
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "parts.content_type";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bkgv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar6.c = new dqps() { // from class: bkgw
        };
        dqprVarM6.a();
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "parts.original_uri";
        dqprVarM7.i(10021);
        dqogVar7.d = new Supplier() { // from class: bkgx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar7.c = new dqps() { // from class: bkgy
        };
        dqprVarM7.a();
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "parts.storage_uri";
        dqprVarM8.i(29060);
        dqogVar8.d = new Supplier() { // from class: bkgz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar8.c = new dqps() { // from class: bkha
        };
        dqprVarM8.a();
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqogVar9.a = "parts.width";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bkhb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar9.c = new dqps() { // from class: bkhc
        };
        dqprVarM9.a();
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "parts.height";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bkhe
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar10.c = new dqps() { // from class: bkhg
        };
        dqprVarM10.a();
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqogVar11.a = "parts.timestamp";
        dqprVarM11.i(3010);
        dqogVar11.d = new Supplier() { // from class: bkhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar11.c = new dqps() { // from class: bkhi
        };
        dqprVarM11.a();
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqprVarM12.d(true);
        dqogVar12.a = "parts.output_uri";
        dqprVarM12.i(4020);
        dqogVar12.d = new Supplier() { // from class: bkhj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar12.c = new dqps() { // from class: bkhk
        };
        dqprVarM12.a();
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqogVar13.a = "parts.target_size";
        dqprVarM13.i(4020);
        dqogVar13.d = new Supplier() { // from class: bkhl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar13.c = new dqps() { // from class: bkhm
        };
        dqprVarM13.a();
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 1;
        dqogVar14.a = "parts.processing_status";
        dqprVarM14.i(4020);
        dqogVar14.d = new Supplier() { // from class: bkhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar14.c = new dqps() { // from class: bkhp
        };
        dqprVarM14.a();
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 1;
        dqogVar15.a = "parts.cms_attachment_processing_status";
        dqprVarM15.i(44010);
        dqogVar15.d = new Supplier() { // from class: bkhq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar15.c = new dqps() { // from class: bkhs
        };
        dqprVarM15.a();
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqprVarM16.k(true);
        dqprVarM16.d(true);
        dqprVarM16.e(true);
        dqogVar16.b = new Supplier() { // from class: bkht
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar16.a = "parts.conversation_id";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: bkhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar16.c = new dqps() { // from class: bkhv
        };
        dqprVarM16.a();
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "parts.sticker_set_id";
        dqprVarM17.i(5020);
        dqogVar17.d = new Supplier() { // from class: bkhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar17.c = new dqps() { // from class: bkhx
        };
        dqprVarM17.a();
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqogVar18.a = "parts.sticker_id";
        dqprVarM18.i(5020);
        dqogVar18.d = new Supplier() { // from class: bkhy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar18.c = new dqps() { // from class: bkia
        };
        dqprVarM18.a();
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "parts.media_modified_timestamp";
        dqprVarM19.i(7000);
        dqogVar19.d = new Supplier() { // from class: bkib
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar19.c = new dqps() { // from class: bkic
        };
        dqprVarM19.a();
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 3;
        dqogVar20.a = "parts.longitude";
        dqprVarM20.i(10005);
        dqogVar20.d = new Supplier() { // from class: bkie
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar20.c = new dqps() { // from class: bkif
        };
        dqprVarM20.a();
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 3;
        dqogVar21.a = "parts.latitude";
        dqprVarM21.i(10005);
        dqogVar21.d = new Supplier() { // from class: bkig
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar21.c = new dqps() { // from class: bkih
        };
        dqprVarM21.a();
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 4;
        dqogVar22.a = "parts.preview_content_uri";
        dqprVarM22.i(10017);
        dqogVar22.d = new Supplier() { // from class: bkii
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar22.c = new dqps() { // from class: bkij
        };
        dqprVarM22.a();
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqprVarM23.d(true);
        dqogVar23.a = "parts.preview_content_type";
        dqprVarM23.i(10017);
        dqogVar23.d = new Supplier() { // from class: bkil
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar23.c = new dqps() { // from class: bkim
        };
        dqprVarM23.a();
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 4;
        dqogVar24.a = "parts.fallback_uri";
        dqprVarM24.i(13000);
        dqogVar24.d = new Supplier() { // from class: bkin
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar24.c = new dqps() { // from class: bkio
        };
        dqprVarM24.a();
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqogVar25.a = "parts.source";
        dqprVarM25.i(14010);
        dqogVar25.d = new Supplier() { // from class: bkiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar25.c = new dqps() { // from class: bkir
        };
        dqprVarM25.a();
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 1;
        dqogVar26.a = "parts.bundle_index";
        dqprVarM26.i(17010);
        dqogVar26.d = new Supplier() { // from class: bkis
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar26.c = new dqps() { // from class: bkit
        };
        dqprVarM26.a();
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqogVar27.a = "parts.blob_id";
        dqprVarM27.i(17020);
        dqogVar27.d = new Supplier() { // from class: bkiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar27.c = new dqps() { // from class: bkiw
        };
        dqprVarM27.a();
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "parts.blob_gaia_email";
        dqprVarM28.i(59570);
        dqogVar28.d = new Supplier() { // from class: bkix
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar28.c = new dqps() { // from class: bkiy
        };
        dqprVarM28.a();
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqogVar29.a = "parts.cms_full_size_blob_id";
        dqprVarM29.i(40040);
        dqogVar29.d = new Supplier() { // from class: bkiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar29.c = new dqps() { // from class: bkja
        };
        dqprVarM29.a();
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 5;
        dqogVar30.a = "parts.cms_media_encryption_key";
        dqprVarM30.i(42010);
        dqogVar30.d = new Supplier() { // from class: bkjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar30.c = new dqps() { // from class: bkjd
        };
        dqprVarM30.a();
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 5;
        dqogVar31.a = "parts.cms_compressed_media_encryption_key";
        dqprVarM31.i(42070);
        dqogVar31.d = new Supplier() { // from class: bkje
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar31.c = new dqps() { // from class: bkjf
        };
        dqprVarM31.a();
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "parts.blob_upload_permanent_failure";
        dqprVarM32.i(18000);
        dqogVar32.d = new Supplier() { // from class: bkjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar32.c = new dqps() { // from class: bkji
        };
        dqprVarM32.a();
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "parts.blob_upload_timestamp";
        dqprVarM33.i(19030);
        dqogVar33.d = new Supplier() { // from class: bkjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar33.c = new dqps() { // from class: bkjk
        };
        dqprVarM33.a();
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 4;
        dqogVar34.a = "parts.expressive_sticker_name";
        dqprVarM34.i(22060);
        dqogVar34.d = new Supplier() { // from class: bkjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar34.c = new dqps() { // from class: bkjm
        };
        dqprVarM34.a();
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 4;
        dqogVar35.a = "parts.file_name";
        dqprVarM35.i(26000);
        dqogVar35.d = new Supplier() { // from class: bkjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar35.c = new dqps() { // from class: bkjp
        };
        dqprVarM35.a();
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 1;
        dqogVar36.a = "parts.duration";
        dqprVarM36.i(26040);
        dqogVar36.d = new Supplier() { // from class: bkjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar36.c = new dqps() { // from class: bkjs
        };
        dqprVarM36.a();
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 4;
        dqogVar37.a = "parts.compressed_blob_id";
        dqprVarM37.i(27000);
        dqogVar37.d = new Supplier() { // from class: bkjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar37.c = new dqps() { // from class: bkju
        };
        dqprVarM37.a();
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqogVar38.a = "parts.cms_compressed_blob_id";
        dqprVarM38.i(40040);
        dqogVar38.d = new Supplier() { // from class: bkjv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar38.c = new dqps() { // from class: bkjw
        };
        dqprVarM38.a();
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "parts.compressed_blob_upload_permanent_failure";
        dqprVarM39.i(27000);
        dqogVar39.d = new Supplier() { // from class: bkjx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar39.c = new dqps() { // from class: bkjy
        };
        dqprVarM39.a();
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "parts.compressed_blob_upload_timestamp";
        dqprVarM40.i(27000);
        dqogVar40.d = new Supplier() { // from class: bkka
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar40.c = new dqps() { // from class: bkkb
        };
        dqprVarM40.a();
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 5;
        dqogVar41.a = "parts.media_encryption_key";
        dqprVarM41.i(30040);
        dqogVar41.d = new Supplier() { // from class: bkkd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar41.c = new dqps() { // from class: bkke
        };
        dqprVarM41.a();
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 5;
        dqogVar42.a = "parts.compressed_media_encryption_key";
        dqprVarM42.i(30040);
        dqogVar42.d = new Supplier() { // from class: bkkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar42.c = new dqps() { // from class: bkkg
        };
        dqprVarM42.a();
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 5;
        dqogVar43.a = "parts.attachment_upload_response";
        dqprVarM43.i(49010);
        dqogVar43.d = new Supplier() { // from class: bkkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar43.c = new dqps() { // from class: bkki
        };
        dqprVarM43.a();
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "parts.missing_entry_in_telephony";
        dqprVarM44.i(52030);
        dqogVar44.d = new Supplier() { // from class: bkkj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar44.c = new dqps() { // from class: bkkk
        };
        dqprVarM44.a();
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "parts.awaiting_reverse_sync";
        dqprVarM45.i(53040);
        dqogVar45.d = new Supplier() { // from class: bkkm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar45.c = new dqps() { // from class: bkgj
        };
        dqprVarM45.a();
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 1;
        dqogVar46.a = "parts.file_size_bytes";
        dqprVarM46.i(52050);
        dqogVar46.d = new Supplier() { // from class: bkgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar46.c = new dqps() { // from class: bkgl
        };
        dqprVarM46.a();
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 4;
        dqprVarM47.d(true);
        dqogVar47.a = "parts.local_cache_path";
        dqprVarM47.i(52050);
        dqogVar47.d = new Supplier() { // from class: bkgm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar47.c = new dqps() { // from class: bkgn
        };
        dqprVarM47.a();
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 1;
        dqogVar48.a = "parts.media_send_type";
        dqprVarM48.i(58150);
        dqogVar48.d = new Supplier() { // from class: bkgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar48.c = new dqps() { // from class: bkgp
        };
        dqprVarM48.a();
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 5;
        dqogVar49.a = "parts.voice_metadata";
        dqprVarM49.i(59470);
        dqogVar49.d = new Supplier() { // from class: bkgq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar49.c = new dqps() { // from class: bkgr
        };
        dqprVarM49.a();
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 1;
        dqogVar50.a = "parts.validation_status";
        dqprVarM50.i(58770);
        dqogVar50.d = new Supplier() { // from class: bkhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar50.c = new dqps() { // from class: bkho
        };
        dqprVarM50.a();
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 4;
        dqogVar51.a = "parts.processing_id";
        dqprVarM51.i(60080);
        dqogVar51.d = new Supplier() { // from class: bkhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar51.c = new dqps() { // from class: bkik
        };
        dqprVarM51.a();
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 1;
        dqogVar52.a = "parts.rich_card_media_download_failure_reason";
        dqprVarM52.i(60230);
        dqogVar52.d = new Supplier() { // from class: bkiv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar52.c = new dqps() { // from class: bkjg
        };
        dqprVarM52.a();
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 1;
        dqogVar53.a = "parts.image_display_state";
        dqprVarM53.i(60240);
        dqogVar53.d = new Supplier() { // from class: bkjr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar53.c = new dqps() { // from class: bkkc
        };
        dqprVarM53.a();
        dqpr dqprVarM54 = dqpt.m();
        dqog dqogVar54 = (dqog) dqprVarM54;
        dqogVar54.e = 1;
        dqogVar54.a = "parts.preserve_size";
        dqprVarM54.i(60680);
        dqogVar54.d = new Supplier() { // from class: bkkn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dqogVar54.c = new dqps() { // from class: bkgt
        };
        dqprVarM54.a();
    }
}
