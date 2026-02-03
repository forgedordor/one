package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsgr {
    public final bsgs A;
    public final bsgs B;
    public final bsgs C;
    public final bsgs D;
    public final bsgs E;
    public final bsgs F;
    public final bsgs G;
    public final bsgs H;
    public final bsgs I;
    public final bsgs J;
    public final bsgs K;
    public final bsgs L;
    public final bsgs M;
    public final bsgs N;
    public final bsgs O;
    public final bsgs P;
    public final bsgs Q;
    public final bsgs R;
    public final bsgs S;
    public final bsgs T;
    public final bsgs U;
    public final bsgs V;
    public final bsgs W;
    public final bsgs X;
    public final bsgs Y;
    public final bsgs Z;
    public final bsgs a;
    public final bsgs aa;
    final bsgs[] ab;
    public final bsgs b;
    public final bsgs c;
    public final bsgs d;
    public final bsgs e;
    public final bsgs f;
    public final bsgs g;
    public final bsgs h;
    public final bsgs i;
    public final bsgs j;
    public final bsgs k;
    public final bsgs l;
    public final bsgs m;
    public final bsgs n;
    public final bsgs o;
    public final bsgs p;
    public final bsgs q;
    public final bsgs r;
    public final bsgs s;
    public final bsgs t;
    public final bsgs u;
    public final bsgs v;
    public final bsgs w;
    public final bsgs x;
    public final bsgs y;
    public final bsgs z;

    public bsgr() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 2;
        dqprVarM.l(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "parts._id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: bscn
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar.c = new dqps() { // from class: bsdf
        };
        bsgs bsgsVar = new bsgs(dqprVarM.a());
        this.a = bsgsVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 1;
        dqprVarM2.d(true);
        dqprVarM2.e(true);
        dqogVar2.b = new Supplier() { // from class: bsds
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dqogVar2.a = "parts.message_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: bsee
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar2.c = new dqps() { // from class: bseq
        };
        bsgs bsgsVar2 = new bsgs(dqprVarM2.a());
        this.b = bsgsVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 4;
        dqogVar3.a = "parts.text";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: bsfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar3.c = new dqps() { // from class: bsfo
        };
        bsgs bsgsVar3 = new bsgs(dqprVarM3.a());
        this.c = bsgsVar3;
        dqpr dqprVarM4 = dqpt.m();
        dqog dqogVar4 = (dqog) dqprVarM4;
        dqogVar4.e = 4;
        dqogVar4.a = "parts.raw_text";
        dqprVarM4.i(60990);
        dqogVar4.d = new Supplier() { // from class: bsga
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar4.c = new dqps() { // from class: bsgm
        };
        bsgs bsgsVar4 = new bsgs(dqprVarM4.a());
        this.d = bsgsVar4;
        dqpr dqprVarM5 = dqpt.m();
        dqog dqogVar5 = (dqog) dqprVarM5;
        dqogVar5.e = 4;
        dqogVar5.a = "parts.uri";
        dqprVarM5.i(-1);
        dqogVar5.d = new Supplier() { // from class: bscv
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar5.c = new dqps() { // from class: bsgq
        };
        bsgs bsgsVar5 = new bsgs(dqprVarM5.a());
        this.e = bsgsVar5;
        dqpr dqprVarM6 = dqpt.m();
        dqog dqogVar6 = (dqog) dqprVarM6;
        dqogVar6.e = 4;
        dqprVarM6.d(true);
        dqogVar6.a = "parts.content_type";
        dqprVarM6.i(-1);
        dqogVar6.d = new Supplier() { // from class: bscw
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar6.c = new dqps() { // from class: bscx
        };
        bsgs bsgsVar6 = new bsgs(dqprVarM6.a());
        this.f = bsgsVar6;
        dqpr dqprVarM7 = dqpt.m();
        dqog dqogVar7 = (dqog) dqprVarM7;
        dqogVar7.e = 4;
        dqogVar7.a = "parts.original_uri";
        dqprVarM7.i(10021);
        dqogVar7.d = new Supplier() { // from class: bscy
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar7.c = new dqps() { // from class: bscz
        };
        bsgs bsgsVar7 = new bsgs(dqprVarM7.a());
        this.g = bsgsVar7;
        dqpr dqprVarM8 = dqpt.m();
        dqog dqogVar8 = (dqog) dqprVarM8;
        dqogVar8.e = 4;
        dqogVar8.a = "parts.storage_uri";
        dqprVarM8.i(29060);
        dqogVar8.d = new Supplier() { // from class: bsda
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar8.c = new dqps() { // from class: bsdb
        };
        bsgs bsgsVar8 = new bsgs(dqprVarM8.a());
        this.h = bsgsVar8;
        dqpr dqprVarM9 = dqpt.m();
        dqog dqogVar9 = (dqog) dqprVarM9;
        dqogVar9.e = 1;
        dqogVar9.a = "parts.width";
        dqprVarM9.i(-1);
        dqogVar9.d = new Supplier() { // from class: bsdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar9.c = new dqps() { // from class: bsdd
        };
        bsgs bsgsVar9 = new bsgs(dqprVarM9.a());
        this.i = bsgsVar9;
        dqpr dqprVarM10 = dqpt.m();
        dqog dqogVar10 = (dqog) dqprVarM10;
        dqogVar10.e = 1;
        dqogVar10.a = "parts.height";
        dqprVarM10.i(-1);
        dqogVar10.d = new Supplier() { // from class: bsde
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar10.c = new dqps() { // from class: bsdh
        };
        bsgs bsgsVar10 = new bsgs(dqprVarM10.a());
        this.j = bsgsVar10;
        dqpr dqprVarM11 = dqpt.m();
        dqog dqogVar11 = (dqog) dqprVarM11;
        dqogVar11.e = 1;
        dqogVar11.a = "parts.timestamp";
        dqprVarM11.i(3010);
        dqogVar11.d = new Supplier() { // from class: bsdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar11.c = new dqps() { // from class: bsdj
        };
        bsgs bsgsVar11 = new bsgs(dqprVarM11.a());
        this.k = bsgsVar11;
        dqpr dqprVarM12 = dqpt.m();
        dqog dqogVar12 = (dqog) dqprVarM12;
        dqogVar12.e = 4;
        dqprVarM12.d(true);
        dqogVar12.a = "parts.output_uri";
        dqprVarM12.i(4020);
        dqogVar12.d = new Supplier() { // from class: bsdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar12.c = new dqps() { // from class: bsdl
        };
        bsgs bsgsVar12 = new bsgs(dqprVarM12.a());
        this.l = bsgsVar12;
        dqpr dqprVarM13 = dqpt.m();
        dqog dqogVar13 = (dqog) dqprVarM13;
        dqogVar13.e = 1;
        dqogVar13.a = "parts.target_size";
        dqprVarM13.i(4020);
        dqogVar13.d = new Supplier() { // from class: bsdm
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar13.c = new dqps() { // from class: bsdn
        };
        bsgs bsgsVar13 = new bsgs(dqprVarM13.a());
        this.m = bsgsVar13;
        dqpr dqprVarM14 = dqpt.m();
        dqog dqogVar14 = (dqog) dqprVarM14;
        dqogVar14.e = 1;
        dqogVar14.a = "parts.processing_status";
        dqprVarM14.i(4020);
        dqogVar14.d = new Supplier() { // from class: bsdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar14.c = new dqps() { // from class: bsdp
        };
        bsgs bsgsVar14 = new bsgs(dqprVarM14.a());
        this.n = bsgsVar14;
        dqpr dqprVarM15 = dqpt.m();
        dqog dqogVar15 = (dqog) dqprVarM15;
        dqogVar15.e = 1;
        dqogVar15.a = "parts.cms_attachment_processing_status";
        dqprVarM15.i(44010);
        dqogVar15.d = new Supplier() { // from class: bsdq
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar15.c = new dqps() { // from class: bsdt
        };
        bsgs bsgsVar15 = new bsgs(dqprVarM15.a());
        this.o = bsgsVar15;
        dqpr dqprVarM16 = dqpt.m();
        dqog dqogVar16 = (dqog) dqprVarM16;
        dqogVar16.e = 1;
        dqprVarM16.k(true);
        dqprVarM16.d(true);
        dqprVarM16.e(true);
        dqogVar16.b = new Supplier() { // from class: bsdu
            @Override // java.util.function.Supplier
            public final Object get() {
                return botm.c.a;
            }
        };
        dqogVar16.a = "parts.conversation_id";
        dqprVarM16.i(-1);
        dqogVar16.d = new Supplier() { // from class: bsdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar16.c = new dqps() { // from class: bsdw
        };
        bsgs bsgsVar16 = new bsgs(dqprVarM16.a());
        this.p = bsgsVar16;
        dqpr dqprVarM17 = dqpt.m();
        dqog dqogVar17 = (dqog) dqprVarM17;
        dqogVar17.e = 1;
        dqogVar17.a = "parts.sticker_set_id";
        dqprVarM17.i(5020);
        dqogVar17.d = new Supplier() { // from class: bsdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar17.c = new dqps() { // from class: bsdy
        };
        bsgs bsgsVar17 = new bsgs(dqprVarM17.a());
        this.q = bsgsVar17;
        dqpr dqprVarM18 = dqpt.m();
        dqog dqogVar18 = (dqog) dqprVarM18;
        dqogVar18.e = 1;
        dqogVar18.a = "parts.sticker_id";
        dqprVarM18.i(5020);
        dqogVar18.d = new Supplier() { // from class: bsdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar18.c = new dqps() { // from class: bsea
        };
        bsgs bsgsVar18 = new bsgs(dqprVarM18.a());
        this.r = bsgsVar18;
        dqpr dqprVarM19 = dqpt.m();
        dqog dqogVar19 = (dqog) dqprVarM19;
        dqogVar19.e = 1;
        dqogVar19.a = "parts.media_modified_timestamp";
        dqprVarM19.i(7000);
        dqogVar19.d = new Supplier() { // from class: bseb
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar19.c = new dqps() { // from class: bsed
        };
        bsgs bsgsVar19 = new bsgs(dqprVarM19.a());
        this.s = bsgsVar19;
        dqpr dqprVarM20 = dqpt.m();
        dqog dqogVar20 = (dqog) dqprVarM20;
        dqogVar20.e = 3;
        dqogVar20.a = "parts.longitude";
        dqprVarM20.i(10005);
        dqogVar20.d = new Supplier() { // from class: bsef
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar20.c = new dqps() { // from class: bseg
        };
        bsgs bsgsVar20 = new bsgs(dqprVarM20.a());
        this.t = bsgsVar20;
        dqpr dqprVarM21 = dqpt.m();
        dqog dqogVar21 = (dqog) dqprVarM21;
        dqogVar21.e = 3;
        dqogVar21.a = "parts.latitude";
        dqprVarM21.i(10005);
        dqogVar21.d = new Supplier() { // from class: bseh
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar21.c = new dqps() { // from class: bsei
        };
        bsgs bsgsVar21 = new bsgs(dqprVarM21.a());
        this.u = bsgsVar21;
        dqpr dqprVarM22 = dqpt.m();
        dqog dqogVar22 = (dqog) dqprVarM22;
        dqogVar22.e = 4;
        dqogVar22.a = "parts.preview_content_uri";
        dqprVarM22.i(10017);
        dqogVar22.d = new Supplier() { // from class: bsej
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar22.c = new dqps() { // from class: bsek
        };
        bsgs bsgsVar22 = new bsgs(dqprVarM22.a());
        this.v = bsgsVar22;
        dqpr dqprVarM23 = dqpt.m();
        dqog dqogVar23 = (dqog) dqprVarM23;
        dqogVar23.e = 4;
        dqprVarM23.d(true);
        dqogVar23.a = "parts.preview_content_type";
        dqprVarM23.i(10017);
        dqogVar23.d = new Supplier() { // from class: bsel
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar23.c = new dqps() { // from class: bsem
        };
        bsgs bsgsVar23 = new bsgs(dqprVarM23.a());
        this.w = bsgsVar23;
        dqpr dqprVarM24 = dqpt.m();
        dqog dqogVar24 = (dqog) dqprVarM24;
        dqogVar24.e = 4;
        dqogVar24.a = "parts.fallback_uri";
        dqprVarM24.i(13000);
        dqogVar24.d = new Supplier() { // from class: bseo
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar24.c = new dqps() { // from class: bsep
        };
        bsgs bsgsVar24 = new bsgs(dqprVarM24.a());
        this.x = bsgsVar24;
        dqpr dqprVarM25 = dqpt.m();
        dqog dqogVar25 = (dqog) dqprVarM25;
        dqogVar25.e = 1;
        dqogVar25.a = "parts.source";
        dqprVarM25.i(14010);
        dqogVar25.d = new Supplier() { // from class: bser
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar25.c = new dqps() { // from class: bses
        };
        bsgs bsgsVar25 = new bsgs(dqprVarM25.a());
        this.y = bsgsVar25;
        dqpr dqprVarM26 = dqpt.m();
        dqog dqogVar26 = (dqog) dqprVarM26;
        dqogVar26.e = 1;
        dqogVar26.a = "parts.bundle_index";
        dqprVarM26.i(17010);
        dqogVar26.d = new Supplier() { // from class: bset
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar26.c = new dqps() { // from class: bseu
        };
        bsgs bsgsVar26 = new bsgs(dqprVarM26.a());
        this.z = bsgsVar26;
        dqpr dqprVarM27 = dqpt.m();
        dqog dqogVar27 = (dqog) dqprVarM27;
        dqogVar27.e = 4;
        dqogVar27.a = "parts.blob_id";
        dqprVarM27.i(17020);
        dqogVar27.d = new Supplier() { // from class: bsev
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar27.c = new dqps() { // from class: bsew
        };
        bsgs bsgsVar27 = new bsgs(dqprVarM27.a());
        this.A = bsgsVar27;
        dqpr dqprVarM28 = dqpt.m();
        dqog dqogVar28 = (dqog) dqprVarM28;
        dqogVar28.e = 4;
        dqogVar28.a = "parts.blob_gaia_email";
        dqprVarM28.i(59570);
        dqogVar28.d = new Supplier() { // from class: bsex
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar28.c = new dqps() { // from class: bsez
        };
        bsgs bsgsVar28 = new bsgs(dqprVarM28.a());
        this.B = bsgsVar28;
        dqpr dqprVarM29 = dqpt.m();
        dqog dqogVar29 = (dqog) dqprVarM29;
        dqogVar29.e = 4;
        dqogVar29.a = "parts.cms_full_size_blob_id";
        dqprVarM29.i(40040);
        dqogVar29.d = new Supplier() { // from class: bsfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar29.c = new dqps() { // from class: bsfb
        };
        bsgs bsgsVar29 = new bsgs(dqprVarM29.a());
        this.C = bsgsVar29;
        dqpr dqprVarM30 = dqpt.m();
        dqog dqogVar30 = (dqog) dqprVarM30;
        dqogVar30.e = 5;
        dqogVar30.a = "parts.cms_media_encryption_key";
        dqprVarM30.i(42010);
        dqogVar30.d = new Supplier() { // from class: bsfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar30.c = new dqps() { // from class: bsfe
        };
        bsgs bsgsVar30 = new bsgs(dqprVarM30.a());
        this.D = bsgsVar30;
        dqpr dqprVarM31 = dqpt.m();
        dqog dqogVar31 = (dqog) dqprVarM31;
        dqogVar31.e = 5;
        dqogVar31.a = "parts.cms_compressed_media_encryption_key";
        dqprVarM31.i(42070);
        dqogVar31.d = new Supplier() { // from class: bsff
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar31.c = new dqps() { // from class: bsfg
        };
        bsgs bsgsVar31 = new bsgs(dqprVarM31.a());
        this.E = bsgsVar31;
        dqpr dqprVarM32 = dqpt.m();
        dqog dqogVar32 = (dqog) dqprVarM32;
        dqogVar32.e = 1;
        dqogVar32.a = "parts.blob_upload_permanent_failure";
        dqprVarM32.i(18000);
        dqogVar32.d = new Supplier() { // from class: bsfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar32.c = new dqps() { // from class: bsfi
        };
        bsgs bsgsVar32 = new bsgs(dqprVarM32.a());
        this.F = bsgsVar32;
        dqpr dqprVarM33 = dqpt.m();
        dqog dqogVar33 = (dqog) dqprVarM33;
        dqogVar33.e = 1;
        dqogVar33.a = "parts.blob_upload_timestamp";
        dqprVarM33.i(19030);
        dqogVar33.d = new Supplier() { // from class: bsfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar33.c = new dqps() { // from class: bsfl
        };
        bsgs bsgsVar33 = new bsgs(dqprVarM33.a());
        this.G = bsgsVar33;
        dqpr dqprVarM34 = dqpt.m();
        dqog dqogVar34 = (dqog) dqprVarM34;
        dqogVar34.e = 4;
        dqogVar34.a = "parts.expressive_sticker_name";
        dqprVarM34.i(22060);
        dqogVar34.d = new Supplier() { // from class: bsfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar34.c = new dqps() { // from class: bsfn
        };
        bsgs bsgsVar34 = new bsgs(dqprVarM34.a());
        this.H = bsgsVar34;
        dqpr dqprVarM35 = dqpt.m();
        dqog dqogVar35 = (dqog) dqprVarM35;
        dqogVar35.e = 4;
        dqogVar35.a = "parts.file_name";
        dqprVarM35.i(26000);
        dqogVar35.d = new Supplier() { // from class: bsfp
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar35.c = new dqps() { // from class: bsfq
        };
        bsgs bsgsVar35 = new bsgs(dqprVarM35.a());
        this.I = bsgsVar35;
        dqpr dqprVarM36 = dqpt.m();
        dqog dqogVar36 = (dqog) dqprVarM36;
        dqogVar36.e = 1;
        dqogVar36.a = "parts.duration";
        dqprVarM36.i(26040);
        dqogVar36.d = new Supplier() { // from class: bsfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar36.c = new dqps() { // from class: bsfs
        };
        bsgs bsgsVar36 = new bsgs(dqprVarM36.a());
        this.J = bsgsVar36;
        dqpr dqprVarM37 = dqpt.m();
        dqog dqogVar37 = (dqog) dqprVarM37;
        dqogVar37.e = 4;
        dqogVar37.a = "parts.compressed_blob_id";
        dqprVarM37.i(27000);
        dqogVar37.d = new Supplier() { // from class: bsft
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar37.c = new dqps() { // from class: bsfv
        };
        bsgs bsgsVar37 = new bsgs(dqprVarM37.a());
        this.K = bsgsVar37;
        dqpr dqprVarM38 = dqpt.m();
        dqog dqogVar38 = (dqog) dqprVarM38;
        dqogVar38.e = 4;
        dqogVar38.a = "parts.cms_compressed_blob_id";
        dqprVarM38.i(40040);
        dqogVar38.d = new Supplier() { // from class: bsfw
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar38.c = new dqps() { // from class: bsfx
        };
        bsgs bsgsVar38 = new bsgs(dqprVarM38.a());
        this.L = bsgsVar38;
        dqpr dqprVarM39 = dqpt.m();
        dqog dqogVar39 = (dqog) dqprVarM39;
        dqogVar39.e = 1;
        dqogVar39.a = "parts.compressed_blob_upload_permanent_failure";
        dqprVarM39.i(27000);
        dqogVar39.d = new Supplier() { // from class: bsfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar39.c = new dqps() { // from class: bsfz
        };
        bsgs bsgsVar39 = new bsgs(dqprVarM39.a());
        this.M = bsgsVar39;
        dqpr dqprVarM40 = dqpt.m();
        dqog dqogVar40 = (dqog) dqprVarM40;
        dqogVar40.e = 1;
        dqogVar40.a = "parts.compressed_blob_upload_timestamp";
        dqprVarM40.i(27000);
        dqogVar40.d = new Supplier() { // from class: bsgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar40.c = new dqps() { // from class: bsgc
        };
        bsgs bsgsVar40 = new bsgs(dqprVarM40.a());
        this.N = bsgsVar40;
        dqpr dqprVarM41 = dqpt.m();
        dqog dqogVar41 = (dqog) dqprVarM41;
        dqogVar41.e = 5;
        dqogVar41.a = "parts.media_encryption_key";
        dqprVarM41.i(30040);
        dqogVar41.d = new Supplier() { // from class: bsgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar41.c = new dqps() { // from class: bsge
        };
        bsgs bsgsVar41 = new bsgs(dqprVarM41.a());
        this.O = bsgsVar41;
        dqpr dqprVarM42 = dqpt.m();
        dqog dqogVar42 = (dqog) dqprVarM42;
        dqogVar42.e = 5;
        dqogVar42.a = "parts.compressed_media_encryption_key";
        dqprVarM42.i(30040);
        dqogVar42.d = new Supplier() { // from class: bsgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar42.c = new dqps() { // from class: bsgh
        };
        bsgs bsgsVar42 = new bsgs(dqprVarM42.a());
        this.P = bsgsVar42;
        dqpr dqprVarM43 = dqpt.m();
        dqog dqogVar43 = (dqog) dqprVarM43;
        dqogVar43.e = 1;
        dqogVar43.a = "parts.missing_entry_in_telephony";
        dqprVarM43.i(52030);
        dqogVar43.d = new Supplier() { // from class: bsgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar43.c = new dqps() { // from class: bsgj
        };
        bsgs bsgsVar43 = new bsgs(dqprVarM43.a());
        this.Q = bsgsVar43;
        dqpr dqprVarM44 = dqpt.m();
        dqog dqogVar44 = (dqog) dqprVarM44;
        dqogVar44.e = 1;
        dqogVar44.a = "parts.awaiting_reverse_sync";
        dqprVarM44.i(53040);
        dqogVar44.d = new Supplier() { // from class: bsgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar44.c = new dqps() { // from class: bsgl
        };
        bsgs bsgsVar44 = new bsgs(dqprVarM44.a());
        this.R = bsgsVar44;
        dqpr dqprVarM45 = dqpt.m();
        dqog dqogVar45 = (dqog) dqprVarM45;
        dqogVar45.e = 1;
        dqogVar45.a = "parts.file_size_bytes";
        dqprVarM45.i(52050);
        dqogVar45.d = new Supplier() { // from class: bsgn
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar45.c = new dqps() { // from class: bsgo
        };
        bsgs bsgsVar45 = new bsgs(dqprVarM45.a());
        this.S = bsgsVar45;
        dqpr dqprVarM46 = dqpt.m();
        dqog dqogVar46 = (dqog) dqprVarM46;
        dqogVar46.e = 4;
        dqprVarM46.d(true);
        dqogVar46.a = "parts.local_cache_path";
        dqprVarM46.i(52050);
        dqogVar46.d = new Supplier() { // from class: bsgp
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar46.c = new dqps() { // from class: bsco
        };
        bsgs bsgsVar46 = new bsgs(dqprVarM46.a());
        this.T = bsgsVar46;
        dqpr dqprVarM47 = dqpt.m();
        dqog dqogVar47 = (dqog) dqprVarM47;
        dqogVar47.e = 1;
        dqogVar47.a = "parts.media_send_type";
        dqprVarM47.i(58150);
        dqogVar47.d = new Supplier() { // from class: bscp
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar47.c = new dqps() { // from class: bscq
        };
        bsgs bsgsVar47 = new bsgs(dqprVarM47.a());
        this.U = bsgsVar47;
        dqpr dqprVarM48 = dqpt.m();
        dqog dqogVar48 = (dqog) dqprVarM48;
        dqogVar48.e = 5;
        dqogVar48.a = "parts.voice_metadata";
        dqprVarM48.i(59470);
        dqogVar48.d = new Supplier() { // from class: bscr
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar48.c = new dqps() { // from class: bscs
        };
        bsgs bsgsVar48 = new bsgs(dqprVarM48.a());
        this.V = bsgsVar48;
        dqpr dqprVarM49 = dqpt.m();
        dqog dqogVar49 = (dqog) dqprVarM49;
        dqogVar49.e = 1;
        dqogVar49.a = "parts.validation_status";
        dqprVarM49.i(58770);
        dqogVar49.d = new Supplier() { // from class: bsct
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar49.c = new dqps() { // from class: bscu
        };
        bsgs bsgsVar49 = new bsgs(dqprVarM49.a());
        this.W = bsgsVar49;
        dqpr dqprVarM50 = dqpt.m();
        dqog dqogVar50 = (dqog) dqprVarM50;
        dqogVar50.e = 4;
        dqogVar50.a = "parts.processing_id";
        dqprVarM50.i(60080);
        dqogVar50.d = new Supplier() { // from class: bsdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar50.c = new dqps() { // from class: bsdr
        };
        bsgs bsgsVar50 = new bsgs(dqprVarM50.a());
        this.X = bsgsVar50;
        dqpr dqprVarM51 = dqpt.m();
        dqog dqogVar51 = (dqog) dqprVarM51;
        dqogVar51.e = 1;
        dqogVar51.a = "parts.rich_card_media_download_failure_reason";
        dqprVarM51.i(60230);
        dqogVar51.d = new Supplier() { // from class: bsec
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar51.c = new dqps() { // from class: bsen
        };
        bsgs bsgsVar51 = new bsgs(dqprVarM51.a());
        this.Y = bsgsVar51;
        dqpr dqprVarM52 = dqpt.m();
        dqog dqogVar52 = (dqog) dqprVarM52;
        dqogVar52.e = 1;
        dqogVar52.a = "parts.image_display_state";
        dqprVarM52.i(60240);
        dqogVar52.d = new Supplier() { // from class: bsey
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar52.c = new dqps() { // from class: bsfj
        };
        bsgs bsgsVar52 = new bsgs(dqprVarM52.a());
        this.Z = bsgsVar52;
        dqpr dqprVarM53 = dqpt.m();
        dqog dqogVar53 = (dqog) dqprVarM53;
        dqogVar53.e = 1;
        dqogVar53.a = "parts.preserve_size";
        dqprVarM53.i(60680);
        dqogVar53.d = new Supplier() { // from class: bsfu
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dqogVar53.c = new dqps() { // from class: bsgf
        };
        bsgs bsgsVar53 = new bsgs(dqprVarM53.a());
        this.aa = bsgsVar53;
        this.ab = new bsgs[]{bsgsVar, bsgsVar2, bsgsVar3, bsgsVar4, bsgsVar5, bsgsVar6, bsgsVar7, bsgsVar8, bsgsVar9, bsgsVar10, bsgsVar11, bsgsVar12, bsgsVar13, bsgsVar14, bsgsVar15, bsgsVar16, bsgsVar17, bsgsVar18, bsgsVar19, bsgsVar20, bsgsVar21, bsgsVar22, bsgsVar23, bsgsVar24, bsgsVar25, bsgsVar26, bsgsVar27, bsgsVar28, bsgsVar29, bsgsVar30, bsgsVar31, bsgsVar32, bsgsVar33, bsgsVar34, bsgsVar35, bsgsVar36, bsgsVar37, bsgsVar38, bsgsVar39, bsgsVar40, bsgsVar41, bsgsVar42, bsgsVar43, bsgsVar44, bsgsVar45, bsgsVar46, bsgsVar47, bsgsVar48, bsgsVar49, bsgsVar50, bsgsVar51, bsgsVar52, bsgsVar53};
    }
}
