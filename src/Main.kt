
fun main(args: Array<String>) {

    val input1 = arrayOf(72713, 93795, 64596, 99366, 124304, 122702, 105674, 94104, 144795, 109412, 138753, 71738, 62172, 149671, 88232, 145707, 82617, 123357,
        63980, 149016, 130921, 125863, 119405, 77839, 140354, 135213, 130550, 131981, 149301, 68884, 52555, 121036, 75237, 64339, 60612, 132912, 63164, 145198,
        109252, 130024, 100738, 74890, 89784, 134474, 68815, 117283, 144774, 138017, 149989, 111506, 119737, 65330, 52388, 69698, 124990, 84232, 58016,
        142321, 119731, 86914, 68524, 87708, 60776, 119259, 73429, 79486, 120369, 57007, 91514, 87226, 131770, 78170, 52871, 149060, 73804, 60034, 72519,
        98065, 132526, 99660, 74854, 111912, 51232, 71499, 127629, 83807, 91061, 60988, 133493, 95170, 110661, 54486, 63241, 141111, 142244, 93120, 137257,
        79822, 95849, 69878)
    println("Puzzle 1a "+Day1().solveA(input1))
    println("Puzzle 1b "+Day1().solveB(input1))

    val input2 = intArrayOf(1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 19, 6, 23, 1, 23, 6, 27, 1, 13, 27, 31, 2, 13, 31, 35, 1, 5, 35,
        39, 2, 39, 13, 43, 1, 10, 43, 47, 2, 13, 47, 51, 1, 6, 51, 55, 2, 55, 13, 59, 1, 59, 10, 63, 1, 63, 10, 67, 2, 10, 67, 71, 1, 6, 71, 75, 1, 10, 75, 79,
        1, 79, 9, 83, 2, 83, 6, 87, 2, 87, 9, 91, 1, 5, 91, 95, 1, 6, 95, 99, 1, 99, 9, 103, 2, 10, 103, 107, 1, 107, 6, 111, 2, 9, 111, 115, 1, 5, 115, 119, 1,
        10, 119, 123, 1, 2, 123, 127, 1, 127, 6, 0, 99, 2, 14, 0, 0)
    println("Puzzle 2a "+Day2().solveA(input2))
    println("Puzzle 2b "+Day2().solveB(input2))

    val input3a = arrayOf("R1002", "U407", "R530", "D268", "R516", "U937", "L74", "U838", "R784", "D684", "L912", "U746", "R189", "U192", "R868", "D345",
        "L972", "D492", "R942", "U631", "L559", "U634", "L80", "U513", "L746", "D997", "L348", "D160", "L655", "U949", "R717", "U396", "R549", "D167", "R591",
        "U469", "L22", "U977", "L167", "D856", "L320", "D920", "L396", "U490", "L895", "U180", "R661", "D828", "R864", "U189", "R307", "U402", "R409", "U445",
        "L101", "D418", "R812", "U419", "R319", "U75", "L813", "D46", "L491", "U39", "R737", "U11", "R177", "U311", "L278", "U254", "R475", "U166", "L515",
        "D105", "L694", "D437", "L298", "U169", "L613", "D234", "L999", "U380", "L711", "D758", "R932", "D27", "L951", "D529", "L935", "D189", "R816", "D176",
        "R98", "D320", "R965", "D333", "L367", "U622", "R18", "U83", "R275", "D205", "L960", "U177", "R750", "D466", "R442", "U797", "R355", "D717", "L569",
        "D578", "R384", "U863", "R541", "U405", "R527", "D658", "L514", "U168", "L64", "D918", "R947", "D11", "L189", "D875", "R599", "U201", "L165", "U772",
        "L679", "U566", "L195", "U660", "R896", "D622", "R678", "U390", "L984", "D900", "R889", "D714", "R557", "U848", "L176", "U541", "R518", "D699", "L904",
        "D23", "L55", "D886", "L206", "D621", "L48", "D197", "R502", "D259", "L779", "D72", "L183", "U747", "L424", "U452", "L603", "U561", "L430", "D942",
        "R515", "D378", "R962", "U508", "R230", "D650", "R804", "D453", "R899", "D813", "R484", "U798", "R456", "D231", "L316", "U117", "R630", "D436", "L985",
        "D283", "L393", "D370", "R158", "U957", "L914", "D455", "L875", "U536", "R889", "U400", "R347", "U712", "R487", "D455", "R428", "U590", "R127", "D132",
        "L202", "U377", "R138", "U654", "L760", "D46", "R213", "D225", "L817", "U455", "L612", "U543", "L525", "U979", "R591", "D940", "R446", "U786", "R750",
        "U244", "R325", "U928", "L44", "U551", "L955", "U221", "L986", "U516", "L916", "D242", "L280", "D71", "R80", "U849", "L271", "U626", "R737", "D646",
        "R82", "U120", "R646", "U569", "R463", "D94", "R570", "U456", "L548", "D687", "R221", "D759", "L606", "D818", "L859", "U218", "R682", "U299", "R818",
        "D966", "R407", "U605", "L859", "D378", "L53", "D722", "L216", "D221", "R639", "U485", "L865", "D620", "R99", "D988", "R944", "D323", "R540", "U372",
        "L470", "U106", "L804", "D92", "L177", "U518", "R277", "U670", "R451", "D194", "L695", "D502", "L601", "U596", "R374", "U682", "L19", "D54", "L156")
    val input3b = arrayOf("L1003", "U22", "R594", "D241", "L215", "D906", "R733", "D831", "L556", "U421", "L780", "D242", "R183", "U311", "R46", "D52", "R124",
        "D950", "L18", "U985", "R999", "D528", "R850", "U575", "L138", "D62", "L603", "U467", "R641", "U155", "L165", "D63", "L489", "U4", "R635", "D460",
        "L446", "D938", "R983", "U494", "L491", "D433", "L722", "U427", "L469", "U832", "L712", "U798", "R906", "U804", "R646", "U721", "R578", "D194", "L726",
        "U803", "L985", "D934", "R943", "U198", "R726", "U341", "R583", "U998", "L992", "D401", "L132", "D681", "L363", "U949", "L814", "D977", "R840", "D145",
        "L177", "D291", "L652", "D396", "R330", "D951", "L363", "U813", "R847", "D374", "R961", "D912", "R516", "D178", "R495", "U49", "R340", "D395", "R632",
        "D991", "R487", "D263", "R320", "D948", "R456", "D142", "L783", "D888", "R589", "D999", "L159", "U686", "R402", "D586", "L425", "U946", "R56", "D979",
        "L534", "U313", "R657", "D401", "L666", "D504", "R712", "D232", "L557", "D620", "R193", "D670", "L134", "D975", "R837", "D901", "R813", "U459", "L499",
        "U450", "L87", "U84", "L582", "U310", "R795", "D280", "L730", "D458", "L727", "D196", "R95", "U210", "R498", "U760", "R778", "U325", "R715", "U479",
        "R275", "U557", "L450", "D196", "L60", "U115", "R475", "D265", "L611", "D372", "R60", "U935", "L717", "U809", "L344", "D854", "L386", "U473", "R72",
        "U968", "L816", "U900", "R866", "U172", "R965", "U383", "R576", "D774", "R753", "U788", "L781", "D237", "L401", "U786", "R873", "U331", "R609", "D232",
        "L603", "U685", "L494", "U177", "L982", "D173", "L673", "U772", "L7", "U7", "R517", "U573", "R212", "D413", "L124", "D810", "L223", "U137", "L576",
        "U95", "R128", "U896", "L91", "U932", "L875", "U917", "R106", "U911", "L208", "D507", "L778", "D59", "L71", "D352", "R988", "U708", "L58", "D429",
        "L122", "U771", "L713", "D801", "R188", "U661", "R752", "D374", "R312", "D848", "L504", "D540", "R334", "U517", "R343", "D739", "L727", "D552", "L555",
        "U580", "L857", "U474", "R145", "U188", "L789", "U698", "R735", "U131", "L494", "U162", "L27", "D849", "L140", "D849", "R615", "U798", "R160", "U492",
        "R884", "U521", "L542", "D729", "R498", "D853", "R918", "U565", "R65", "U32", "L607", "U552", "L38", "D822", "L77", "U490", "L190", "D93", "L104",
        "U268", "R702", "D112", "L917", "D876", "L631", "D139", "L989", "U810", "R329", "U253", "L498", "D767", "L550", "U666", "L549", "U616", "R376")
    println("Puzzle 3a "+Day3().solveA(input3a, input3b))
    println("Puzzle 3b "+Day3().solveB(input3a, input3b))

    val rangeStart = 264360
    val rangeEnd = 746325
    println("Puzzle 4a "+Day4().solveA(rangeStart, rangeEnd))
    println("Puzzle 4b "+Day4().solveB(rangeStart, rangeEnd))

    val input5 = intArrayOf(3, 225, 1, 225, 6, 6, 1100, 1, 238, 225, 104, 0, 1102, 45, 16, 225, 2, 65, 191, 224, 1001, 224, -3172, 224, 4, 224, 102, 8, 223,
        223, 1001, 224, 5, 224, 1, 223, 224, 223, 1102, 90, 55, 225, 101, 77, 143, 224, 101, -127, 224, 224, 4, 224, 102, 8, 223, 223, 1001, 224, 7, 224, 1,
        223, 224, 223, 1102, 52, 6, 225, 1101, 65, 90, 225, 1102, 75, 58, 225, 1102, 53, 17, 224, 1001, 224, -901, 224, 4, 224, 1002, 223, 8, 223, 1001, 224, 3,
        224, 1, 224, 223, 223, 1002, 69, 79, 224, 1001, 224, -5135, 224, 4, 224, 1002, 223, 8, 223, 1001, 224, 5, 224, 1, 224, 223, 223, 102, 48, 40, 224, 1001,
        224, -2640, 224, 4, 224, 102, 8, 223, 223, 1001, 224, 1, 224, 1, 224, 223, 223, 1101, 50, 22, 225, 1001, 218, 29, 224, 101, -119, 224, 224, 4, 224, 102,
        8, 223, 223, 1001, 224, 2, 224, 1, 223, 224, 223, 1101, 48, 19, 224, 1001, 224, -67, 224, 4, 224, 102, 8, 223, 223, 1001, 224, 6, 224, 1, 223, 224, 223,
        1101, 61, 77, 225, 1, 13, 74, 224, 1001, 224, -103, 224, 4, 224, 1002, 223, 8, 223, 101, 3, 224, 224, 1, 224, 223, 223, 1102, 28, 90, 225, 4, 223, 99,
        0, 0, 0, 677, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1105, 0, 99999, 1105, 227, 247, 1105, 1, 99999, 1005, 227, 99999, 1005, 0, 256, 1105, 1, 99999, 1106,
        227, 99999, 1106, 0, 265, 1105, 1, 99999, 1006, 0, 99999, 1006, 227, 274, 1105, 1, 99999, 1105, 1, 280, 1105, 1, 99999, 1, 225, 225, 225, 1101, 294, 0,
        0, 105, 1, 0, 1105, 1, 99999, 1106, 0, 300, 1105, 1, 99999, 1, 225, 225, 225, 1101, 314, 0, 0, 106, 0, 0, 1105, 1, 99999, 7, 226, 677, 224, 102, 2, 223,
        223, 1005, 224, 329, 1001, 223, 1, 223, 8, 226, 677, 224, 1002, 223, 2, 223, 1005, 224, 344, 101, 1, 223, 223, 8, 226, 226, 224, 1002, 223, 2, 223,
        1006, 224, 359, 101, 1, 223, 223, 1008, 677, 226, 224, 1002, 223, 2, 223, 1005, 224, 374, 1001, 223, 1, 223, 108, 677, 677, 224, 1002, 223, 2, 223,
        1005, 224, 389, 1001, 223, 1, 223, 1107, 226, 677, 224, 1002, 223, 2, 223, 1006, 224, 404, 101, 1, 223, 223, 1008, 226, 226, 224, 102, 2, 223, 223,
        1006, 224, 419, 1001, 223, 1, 223, 7, 677, 226, 224, 1002, 223, 2, 223, 1005, 224, 434, 101, 1, 223, 223, 1108, 226, 226, 224, 1002, 223, 2, 223, 1005,
        224, 449, 101, 1, 223, 223, 7, 226, 226, 224, 102, 2, 223, 223, 1005, 224, 464, 101, 1, 223, 223, 108, 677, 226, 224, 102, 2, 223, 223, 1005, 224, 479,
        1001, 223, 1, 223, 1007, 677, 226, 224, 1002, 223, 2, 223, 1006, 224, 494, 1001, 223, 1, 223, 1007, 677, 677, 224, 1002, 223, 2, 223, 1006, 224, 509,
        1001, 223, 1, 223, 107, 677, 677, 224, 1002, 223, 2, 223, 1005, 224, 524, 101, 1, 223, 223, 1108, 226, 677, 224, 102, 2, 223, 223, 1006, 224, 539, 1001,
        223, 1, 223, 8, 677, 226, 224, 102, 2, 223, 223, 1005, 224, 554, 101, 1, 223, 223, 1007, 226, 226, 224, 102, 2, 223, 223, 1006, 224, 569, 1001, 223, 1,
        223, 107, 677, 226, 224, 102, 2, 223, 223, 1005, 224, 584, 1001, 223, 1, 223, 108, 226, 226, 224, 102, 2, 223, 223, 1006, 224, 599, 1001, 223, 1, 223,
        107, 226, 226, 224, 1002, 223, 2, 223, 1006, 224, 614, 1001, 223, 1, 223, 1108, 677, 226, 224, 1002, 223, 2, 223, 1005, 224, 629, 1001, 223, 1, 223,
        1107, 677, 677, 224, 102, 2, 223, 223, 1005, 224, 644, 1001, 223, 1, 223, 1008, 677, 677, 224, 102, 2, 223, 223, 1005, 224, 659, 101, 1, 223, 223, 1107,
        677, 226, 224, 1002, 223, 2, 223, 1006, 224, 674, 101, 1, 223, 223, 4, 223, 99, 226)
        val sb1 = StringBuilder()
        println("Puzzle 5a "+ Day5().solveA(input5, sb1))
        val sb2 = StringBuilder()
        println("Puzzle 5b "+ Day5().solveB(input5, sb2))
}